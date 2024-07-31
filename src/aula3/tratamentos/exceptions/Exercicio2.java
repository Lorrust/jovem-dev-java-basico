package aula3.tratamentos.exceptions;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		int num1;
		int num2;

		do {

			num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to divide:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to divide by:"));

			try {
				divideNumbers(num1, num2);

			} catch (ZeroException e) {
				JOptionPane.showMessageDialog(null, "Cannot divide by 0");
			}

		} while (num2 == 0);

	}

	static void divideNumbers(int num1, int num2) throws ZeroException {
		if (num2 == 0) {
			throw new ZeroException();
		}
		int result = num1 / num2;
		JOptionPane.showMessageDialog(null, "The result is " + result);

	}
}
