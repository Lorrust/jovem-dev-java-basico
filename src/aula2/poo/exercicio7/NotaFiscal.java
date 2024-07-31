package aula2.poo.exercicio7;

public class NotaFiscal {

	private String emitente;
	private double valor;

	public void calculaValor(double valorBruto, double desconto) {
		this.valor = valorBruto - desconto;

	}

	public String getEmitente() {
		return emitente;
	}

	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}

	public double getValor() {
		return valor;

	}
}
