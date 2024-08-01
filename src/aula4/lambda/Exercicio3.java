package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Aluno> students = new ArrayList<>();

		String[] names = { "Trogo", "Martir", "Solt", "Tiste", "Toto" };
		Integer[] rollCalls = { 1, 2, 3, 4, 5 };
		String[] birthDates = { "08/08/2008", "09/09/2009", "10/10/2010", "11/11/2011", "12/12/2012" };

		for (int i = 0; i < 5; i++) {
			Aluno student = new Aluno();
			student.setName(names[i]);
			student.setRollCall(rollCalls[i]);
			student.setBirthDate(LocalDate.parse(birthDates[i], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			students.add(student);
		}

		students.removeIf(s -> s.getName().startsWith("T") && s.getName().endsWith("o"));
		students.forEach(System.out::println);

	}
}