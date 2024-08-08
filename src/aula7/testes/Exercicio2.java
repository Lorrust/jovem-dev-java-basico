package aula7.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import aula5.stream.ZeroBertoException;

public class Exercicio2 {

	public static void main(String[] args) {

//			System.out.println(new Exercicio2().searchFirstBerto(names));

	}

	public String searchFirstBerto(List<String> names) {
		return names.stream().filter(Objects::nonNull).filter(name -> name.endsWith("berto")).findFirst()
				.orElseThrow(() -> new ZeroBertoException("No berto was found."));
	}

}
