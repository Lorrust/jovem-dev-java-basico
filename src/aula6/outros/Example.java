package aula6.outros;

public class Example {
	
	private int authNumber;
	
	public Example(int number) {
		this.authNumber = number;
	}
	
	public String verifyNumber(int i) {
		if (authNumber != 50) {
			throw new RuntimeException("Incorrect authentication number.");
		}
		if (i == 0) {
			return "Zero";
		}
		
		throw new IllegalArgumentException("Number must be zero (0).");
	}

}
