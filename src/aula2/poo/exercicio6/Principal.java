
package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static ArrayList<Pessoa> people = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.nome = "Yor";
		p.dataNascimento = LocalDate.of(2008, 1, 5);
		people.add(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "Reginald";
		pf.dataNascimento = LocalDate.of(2010, 10, 11);
		pf.cpf = "002.184.048-70";
		people.add(pf);
		
		Pessoa pessoaNova = youngestPerson(people);
		
		String result = "Pessoa mais Nova: " + pessoaNova.nome + "\nNascimento: " + pessoaNova.dataNascimento;
		
		if (pessoaNova.getClass().equals(PessoaFisica.class)) {
			result += "\nCPF: " + PessoaFisica.class.cast(pessoaNova).cpf;
		}
		
		JOptionPane.showMessageDialog(null, result);
		
	}
	
	public static Pessoa youngestPerson(ArrayList<Pessoa> people) {
		Pessoa youngestPerson = people.get(0);
		for (int i = 1; i < people.size(); i++) {
			if (people.get(i).dataNascimento.isAfter(youngestPerson.dataNascimento)) {
				youngestPerson = people.get(i);
			}
		}
		return youngestPerson;
	}
	
}
