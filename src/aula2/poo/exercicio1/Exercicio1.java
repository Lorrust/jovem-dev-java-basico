package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		double DoubleNumber = Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number:"));
		int castNumber = (int) DoubleNumber;
		JOptionPane.showMessageDialog(null, "Double cast to int: " + castNumber);
		
	}

}
