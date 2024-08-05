package aula5.stream;

import java.time.LocalDate;

public class Pessoa {

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + "]";
	}

	String name;
	String phoneNumber;
	LocalDate birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
