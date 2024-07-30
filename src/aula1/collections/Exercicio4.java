package aula1.collections;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String phrase = JOptionPane.showInputDialog("Write something:");
		HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();

		for (int i = 0; i < phrase.length(); i++) {
			char letter = phrase.charAt(i);

			if (letterCount.containsKey(letter)) {
				int count = letterCount.get(letter);
				letterCount.put(letter, count + 1);
			} else {
				letterCount.put(letter, 1);
			}
		}
		
		System.out.println(letterCount.entrySet());
	}
}