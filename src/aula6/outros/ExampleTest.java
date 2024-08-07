package aula6.outros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExampleTest {
	
	private Example example;
	
	@BeforeEach
	void setup() {
		example = new Example(50);
	}

	@Test
	@DisplayName("If number is zero, must return Zero string")
	void mustReturnStringZeroWhenNumberEqualsZero() {
		
		int i = 0;
		
		String s = example.verifyNumber(i);
		
		double d1 = 0.5;
		double d2 = 0.500000001;
		assertEquals(d1, d2, 0.1);
		
		assertEquals("Zero", s);
	}
	
	@Test
	@DisplayName("If number is not zero, must throw an IllegalArgumentException")
	void mustThrowExceptionWhenNumberNotEqualsZero() {
		
		int i = 2;
		
		assertThrows(IllegalArgumentException.class, () -> example.verifyNumber(i));
		
	}

}
