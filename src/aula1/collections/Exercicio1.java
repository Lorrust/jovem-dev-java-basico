package aula1.collections;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 50; i++) {
			numbers.add(r.nextInt(10));
		}
		
		numbers.sort(null);
		System.out.println(numbers);
		
	}

}
