package aula1.collections;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 50; i++) {
			numbers.add(r.nextInt(10));
		}
		
		System.out.println(numbers.size());

		numbers.sort(null);
		
//		System.out.println(numbers);
		
		ArrayList<Integer> reversedNumbers = new ArrayList<Integer>();
		
		for (int i = numbers.size() - 1; i > 0; i--) {
			System.out.println(i);
			reversedNumbers.add(numbers.get(i));
		}
		
		System.out.println(reversedNumbers);

	}

}