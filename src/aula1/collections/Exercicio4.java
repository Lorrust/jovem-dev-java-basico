package aula1.collections;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String phrase = JOptionPane.showInputDialog("Write something:");

		char[] letters = phrase.toCharArray();
		
		System.out.println(letters);

		HashMap<char[], Integer> letterCount = new HashMap<char[], Integer>();

		for (char letter : letters) {
			System.out.println(letter);
			if (!letterCount.containsKey(letterCount)) {
//				letterCount.put(letter, 1);
				System.out.println("");
				
			}

		}

	}

}
