package aula3.tratamentos.exceptions;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		Venda v = new Venda();

		v.setClientName(JOptionPane.showInputDialog("Enter the client's name:"));
		
		int itemsAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of items:"));

		try {
			if (itemsAmount < 1 || itemsAmount > 10) {
				throw new VendaException();

			}

			for (int i = 0; i < itemsAmount; i++) {
				Item item = new Item();
				item.name = JOptionPane.showInputDialog("Enter the name of item " + (i + 1) + ":");

				do {

					item.price = Double
							.parseDouble(JOptionPane.showInputDialog("Enter the price of " + item.name + ":"));

					try {
						if (item.price <= 0) {
							throw new PrecoIncorretoException();
						}
					} catch (PrecoIncorretoException e) {
						JOptionPane.showMessageDialog(null, "Price must be greater than 0.");
					}
				} while (item.price <= 0);
				
				v.getSale().add(item);
				
			}

		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "Amount of items must be between 1 and 10.");
		}
		
	}
}