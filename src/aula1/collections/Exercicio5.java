package aula1.collections;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers1.add(r.nextInt(10));
			numbers2.add(r.nextInt(10));
		}
		
		for (int i = 0; i < numbers1.size() - 1; i++) {
			if (numbers1.get(i) == numbers2.get(i)) {
				intersection.add(i);
			}
		}
		
		System.out.println("Set 1: " + numbers1);
		System.out.println("Set 2: " + numbers2);
		System.out.println("Intersection: " + intersection);
	}
	

}
