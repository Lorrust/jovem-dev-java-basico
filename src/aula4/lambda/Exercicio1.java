package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 50; i++) {
			numbers.add(r.nextInt(100));
		}
		
		numbers.forEach(System.out::println);
	
	}

}
