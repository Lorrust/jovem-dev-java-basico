package aula6.outros;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int somaExample = Calculadora1Enum.SOMA.calcula(8, 4);
		System.out.println(somaExample);
		
		int subtracaoExample = Calculadora1Enum.SUBTRACAO.calcula(8, 4);
		System.out.println(subtracaoExample);
		
		int divisaoExample = Calculadora1Enum.DIVISAO.calcula(8, 4);
		System.out.println(divisaoExample);
		
		int multiplicacaoExample = Calculadora1Enum.MULTIPLICACAO.calcula(8, 4);
		System.out.println(multiplicacaoExample);
	}

	public enum Calculadora1Enum {
		SOMA("Soma", (num1, num2) -> num1 + num2),
		SUBTRACAO("Subtração", (num1, num2) -> num1 - num2),
		DIVISAO("Divisão", (num1, num2) -> num1 / num2),
		MULTIPLICACAO("Multiplicação", (num1, num2) -> num1 * num2);

		private String nomeAmigavel;
		private CalculoInterface calculo;

		private Calculadora1Enum(String nomeAmigavel, CalculoInterface calculo) {
			this.setNomeAmigavel(nomeAmigavel);
			this.calculo = calculo;
		}
		
		public int calcula(int num1, int num2) {
			return calculo.calcula(num1, num2);
		}

		public String getNomeAmigavel() {
			return nomeAmigavel;
		}

		public void setNomeAmigavel(String nomeAmigavel) {
			this.nomeAmigavel = nomeAmigavel;
		}
		
		
	}

}
