package avaliacao.semana1;

import java.util.List;

public class Venda {

	Cliente client;
	List<ItemVenda> saleList;
	int paymentType;

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public List<ItemVenda> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<ItemVenda> saleList) {
		this.saleList = saleList;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

}
