package aula2.poo.exercicio7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<NotaFiscal> notasFiscais = new ArrayList<NotaFiscal>();
		
		NotaFiscal nota1 = new NotaFiscal();
		nota1.setEmitente("Klein");
		nota1.calculaValor(4989.99, 250.49);
		notasFiscais.add(nota1);
		
		NotaFiscal nota2 = new NotaFiscal();
		nota2.setEmitente("Frederic");
		nota2.calculaValor(150.49, 49.40);
		notasFiscais.add(nota2);
		
		for (NotaFiscal nota : notasFiscais) {
			JOptionPane.showMessageDialog(null, "Emitente: " + nota.getEmitente() + "\nValor: R$" + nota.getValor());
		}
		
	}

}
