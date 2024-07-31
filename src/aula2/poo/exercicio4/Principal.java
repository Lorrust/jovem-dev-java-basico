package aula2.poo.exercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Carro> cars = new ArrayList<Carro>();
		
		String[] models = {"Toyota Corolla", "Ford Mustang", "BMW 3 Series"};
		int[] years = {2022, 2021, 2023};
		String[] colors = {"Red", "Blue", "Black"};
		
		for (int i = 0; i < models.length; i++) {
			Carro car = new Carro();
			car.model = models[i];
			car.year = years[i];
			car.color = colors[i];
			cars.add(car);
		}
		
		for (Carro car : cars) {
			JOptionPane.showMessageDialog(null, "Model: " + car.model
												+ "\nYear: " + car.year
												+ "\nColor: " + car.color);
		}
		
	}

}
