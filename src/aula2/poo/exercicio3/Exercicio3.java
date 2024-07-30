package aula2.poo.exercicio3;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Locale locale = new Locale("pt-br", "BR");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		
	
		
		LocalDate userDate = LocalDate.parse(JOptionPane.showInputDialog("Enter a date:"));
		
		DayOfWeek weekDay = userDate.getDayOfWeek();
		
		JOptionPane.showMessageDialog(null, weekDay);
		
	}

}
