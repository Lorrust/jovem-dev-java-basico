package aula5.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Exercicio1Test {

	@Test
	void test() {
		// Preparing
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(3);
		List<Integer> emptyNumbers = new ArrayList<>();
		
		
		// Processing
		Exercicio1 ex = new Exercicio1();
		Integer result = ex.sumNumbers(numbers);
		Integer emptyResult = ex.sumNumbers(emptyNumbers);
		
		// Testing
		assertEquals(18, result);
		assertEquals(0, emptyResult);
		
	}

}
