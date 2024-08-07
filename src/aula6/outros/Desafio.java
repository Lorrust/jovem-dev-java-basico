package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		List<Evento> eventos = new ArrayList<>();
		eventos.add(new Evento("Soccer", LocalDateTime.of(2024, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));
		eventos.add(new Evento("Soccer", LocalDateTime.of(2024, 8, 6, 12, 0, 0), TipoEventoEnum.LAZER));

		String userInput = JOptionPane.showInputDialog("Digite um evento: ");
		TipoEventoEnum tipo = TipoEventoEnum.valueOf(userInput);

		Map<Boolean, List<Evento>> mapaEvento = eventos.stream().filter(e -> e.getTipo().equals(tipo))
				.collect(Collectors.groupingBy(e -> e.getData().isBefore(LocalDateTime.now())));
		
		System.out.println("Events that have already happened:");
		System.out.println(mapaEvento.get(true));
		System.out.println("Events that are still to happen:");
		System.out.println(mapaEvento.get(false));

	}

}
