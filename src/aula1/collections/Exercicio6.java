package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Double>> studentGrades = new HashMap<String, ArrayList<Double>>();

		int studentAmount = 5;
		int examAmount = 3;

		for (int i = 0; i < studentAmount; i++) {
			String name = JOptionPane.showInputDialog("Enter the student name:");
			double avg = 0;
			ArrayList<Double> grades = new ArrayList<Double>();
			for (int j = 0; j < examAmount; j++) {
				double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade " + (j + 1) + ":"));
				grades.add(grade);
				avg += grade;
			}

			avg /= examAmount;
			studentGrades.put(name, grades);
			JOptionPane.showMessageDialog(null, name + "\n" + grades + "\nAverage: " + avg);
		}

	}

}
