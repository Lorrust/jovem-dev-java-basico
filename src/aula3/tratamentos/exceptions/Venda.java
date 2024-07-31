package aula3.tratamentos.exceptions;

import java.util.ArrayList;

public class Venda {

	String clientName;
	ArrayList<Item> sale;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public ArrayList<Item> getSale() {
		return sale;
	}

	public void setSale(ArrayList<Item> sale) {
		this.sale = sale;
	}

}
