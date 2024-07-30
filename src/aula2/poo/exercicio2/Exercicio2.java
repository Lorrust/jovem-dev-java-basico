package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		String phrase1 = JOptionPane.showInputDialog("Enter a sentence:");
		String phrase2 = JOptionPane.showInputDialog("Enter a sentence:");

		if (phrase1.equals(phrase2)) {
			JOptionPane.showMessageDialog(null, "The sentences are identical.");
		} else {
			JOptionPane.showMessageDialog(null, "The sentences are different.");
		}

	}

}
