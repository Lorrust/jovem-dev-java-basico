package aula7.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercicio1Test {
	
	private Exercicio1 exercicio1 = new Exercicio1();

	@BeforeEach
	void setup() {
		List<Pessoa> people = new ArrayList<>();
	}

	@Test
	@DisplayName("Show names of people ")
	void loadedListMustReturnNames(List<Pessoa> people) {
		
		exercicio1.filterPeople(people);

	}
}
