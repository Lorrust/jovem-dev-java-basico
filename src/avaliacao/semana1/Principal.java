package avaliacao.semana1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// Was not able to complete lambda and reference, and non-verified try-catch implementation, plus the name validation for "Thiago".

public class Principal {

	static List<ItemVenda> saleItemList = new ArrayList<>();

	public static void main(String[] args) {

		Venda sale = new Venda();

		Cliente client = new Cliente();
		client.setName(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		client.setBirthDate(
				LocalDate.parse(JOptionPane.showInputDialog("Informe a data de nascimento do cliente (dd/mm/aaaa):"),
						DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(client.getBirthDate());

		sale.setClient(client);

		String userInput = "";

		do {

			userInput = JOptionPane.showInputDialog("Informe o nome do produto (ou 'fim'):");

			if (!userInput.equals("fim")) {
				newProduct(userInput);
			}

		} while (!userInput.equals("fim"));

		System.out.println(client.toString());
		System.out.println(sale.toString());

		sale.setSaleList(saleItemList);

		for (int i = 0; i < sale.getSaleList().size(); i++) {

			Produto item = sale.getSaleList().get(i).getItem();
			System.out.println(item.getName());
		}

		sale.setPaymentType(Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o tipo de pagamento:\n1 - Cartão de Crédito\n2 - Cartão de Débito\n3 - Dinheiro ")));

		JOptionPane.showMessageDialog(null, coupon(sale));

	}

	public static void newProduct(String itemName) {
		Produto p = new Produto();
		p.setName(itemName);
		p.setUnitPrice(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço por unidade:")));

		do {
			try {
				p.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:")));
				productAmount(p.getAmount());
			} catch (ProductAmountException e) {
				JOptionPane.showMessageDialog(null, "A quantidade não pode ser menor que 0 ou maior que 50.");
			}
		} while (p.getAmount() < 0 || p.getAmount() > 50);

		ItemVenda saleItem = new ItemVenda();
		saleItem.setItem(p);

		saleItemList.add(saleItem);
		System.out.println(saleItemList.toString());
	}

	static void productAmount(int amount) throws ProductAmountException {
		if (amount < 0 || amount > 50) {
			throw new ProductAmountException();
		}

	}

	static String coupon(Venda sale) {
		String message = "****************** CUPOM ******************\n\n";

		double subTotal = 0;

		for (int i = 0; i < sale.getSaleList().size(); i++) {

			Produto item = sale.getSaleList().get(i).getItem();
			double itemTotalPrice = item.getAmount() * item.getUnitPrice();
			subTotal += itemTotalPrice;

			message += item.getName() + "\n";
			message += "  " + item.getAmount() + "x " + String.format("%.2f", item.getUnitPrice())
					+ " ...................................... " + String.format("%.2f", itemTotalPrice) + "\n";
		}

		message += "\nSubTotal ......................................... " + String.format("%.2f", subTotal) + "\n";

		int clientDiscount = checkDiscount(sale.client);
		System.out.println(clientDiscount);
		String discountDesc = "";

		switch (checkDiscount(sale.getClient())) {
		case 30:
			discountDesc = "Descto. 30% aniversariante";
			break;
		case 20:
			discountDesc = "Descto. 20% cliente premium";
		case 10:
			discountDesc = "Descto. 10% terceira idade";
			break;
		default:
			discountDesc = "Sem desconto";
		}

		message += discountDesc + "\n\n";

		double total = subTotal - (subTotal * clientDiscount / 100);

		message += "Total .................................................. " + String.format("%.2f", total);
		message += "\nForma de pagamento: " + checkPaymentType(sale) + "\n";

		message += "Cliente: " + maskName(sale.getClient());

		return message;

	}

	static long calculateAge(Cliente client) {
		LocalDate clientBirthDate = client.getBirthDate();
		LocalDate currentDate = LocalDate.now();

		return Period.between(clientBirthDate, currentDate).toTotalMonths() / 12;

	}

	static int checkDiscount(Cliente client) {
		if (client.getBirthDate().getDayOfYear() == LocalDate.now().getDayOfYear()) {
			return 30;
		}
		if (calculateAge(client) > 60) {
			return 10;
		}
		if (client.getClass().equals(ClientePremium.class)) {
			return 20;
		}
		return 0;
	}

	static String checkPaymentType(Venda sale) {

		switch (sale.getPaymentType()) {
		case 1:
			return "Cartão de Crédito";
		case 2:
			return "Cartão de Débito";
		case 3:
			return "Dinheiro";
		default:
			return "Dinheiro";
		}

	}

	static String maskName(Cliente client) {
		char clientLetter = client.getName().charAt(0);
		return clientLetter + client.getName().replaceAll("[a-zA-Z0-9!@#$%&*]", "*");
	}

}