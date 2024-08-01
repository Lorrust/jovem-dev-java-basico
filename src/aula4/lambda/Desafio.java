package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {
	
	public static void main(String[] args) {
		
		List<String> sentences = new ArrayList<>();
		
		Mostrador upperCase = text -> text.toUpperCase();
		
		String[] phrases = {"Hello, World!", "painting on an invisible canvas", "VSauce", "google idx", "merci beacoup"};
		
		for (String p : phrases) {
			sentences.add(p);
		}
		
		sentences.forEach(s -> upperCase.mostra(s));
		
		
	}

}
