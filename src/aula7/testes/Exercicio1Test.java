package aula7.testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.*;

public class Exercicio1Test {

	@Test
	public void testFilterPeople() {
		List<Pessoa> people = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		p1.setName("Garuda");
		p1.setBirthDate(LocalDate.of(2021, 1, 1));
		people.add(p1);

		Pessoa p2 = new Pessoa();
		p2.setName("Amido");
		p2.setBirthDate(LocalDate.of(2003, 2, 29)); // Leap year
		people.add(p2);

		Pessoa p3 = new Pessoa();
		p3.setName("John");
		p3.setBirthDate(LocalDate.of(2008, 11, 23));
		people.add(p3);

		Exercicio1 exercicio1 = new Exercicio1();
		String result = exercicio1.filterPeople(people);

		assertEquals("Amido, John", result);
	}
}
