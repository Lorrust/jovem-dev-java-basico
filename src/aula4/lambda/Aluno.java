package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

	private String name;
	private int rollCall;
	private LocalDate birthDate;

	@Override
	public String toString() {
		return "Nome: " + name + " | Número da Chamada: " + rollCall + " | Data de Nascimento: " + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollCall() {
		return rollCall;
	}

	public void setRollCall(int rollCall) {
		this.rollCall = rollCall;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
