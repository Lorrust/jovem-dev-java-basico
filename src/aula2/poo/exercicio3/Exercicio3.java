package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate userDate = LocalDate.parse(JOptionPane.showInputDialog("Enter a date (dd/MM/yyyy):"), formatter);
		DayOfWeek weekDay = userDate.getDayOfWeek();
		
		JOptionPane.showMessageDialog(null, weekDay);
		
	}

}
