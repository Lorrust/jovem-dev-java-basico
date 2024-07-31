package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static ArrayList<Pessoa> people = new ArrayList<Pessoa>();

	public static void main(String[] args) {


		Pessoa person1 = new Pessoa();
		person1.name = "Edward";
		person1.birthDate = LocalDate.of(2010, 10, 15);
		people.add(person1);

		Pessoa person2 = new Pessoa();
		person2.name = "Mary";
		person2.birthDate = LocalDate.of(2007, 11, 20);
		people.add(person2);
		
		Pessoa oldPerson = oldestPerson(people);
		
		JOptionPane.showMessageDialog(null, "Oldest Person: " + oldPerson.name + "\nBirth Date: " + oldPerson.birthDate);

	}

	public static Pessoa oldestPerson(ArrayList<Pessoa> people) {
		Pessoa oldestPerson = people.get(0);
		for (int i = 1; i < people.size(); i++) {
			if (people.get(i).birthDate.isBefore(oldestPerson.birthDate)) {
				oldestPerson = people.get(i);
			}
		}
		return oldestPerson;
	}

}
