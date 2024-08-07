package aula6.outros;

import java.util.function.BiFunction;

public class Exercicio3 {
	
	public static void main(String[] args) {

		int somaExample = Calculadora1Enum.SOMA.getCalculo().apply(4, 5);
		System.out.println(somaExample);

		int subtracaoExample = Calculadora1Enum.SUBTRACAO.getCalculo().apply(8, 4);
		System.out.println(subtracaoExample);

		int divisaoExample = Calculadora1Enum.DIVISAO.getCalculo().apply(8, 4);
		System.out.println(divisaoExample);

		int multiplicacaoExample = Calculadora1Enum.MULTIPLICACAO.getCalculo().apply(8, 4);
		System.out.println(multiplicacaoExample);
	}

	public enum Calculadora1Enum {
		SOMA("Soma", (num1, num2) -> num1 + num2),
		SUBTRACAO("Subtração", (num1, num2) -> num1 - num2),
		DIVISAO("Divisão", (num1, num2) -> num1 / num2),
		MULTIPLICACAO("Multiplicação", (num1, num2) -> num1 * num2);

		private String nomeAmigavel;
		private BiFunction<Integer, Integer, Integer> calculo;

		private Calculadora1Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
			this.nomeAmigavel = nomeAmigavel;
			this.calculo = calculo;
		}

		public String getNomeAmigavel() {
			return nomeAmigavel;
		}

		public BiFunction<Integer, Integer, Integer> getCalculo() {
			return calculo;
		}

	}

}
