package aula6.outros;

public class Exercicio1 {

	public static void main(String[] args) {
		
		for (DiaSemanaEnum dia : DiaSemanaEnum.values()) {
			System.out.println(dia.nome() + ", " + dia.isFimDeSemana());
		}

	}

	public enum DiaSemanaEnum {
		DOMINGO {
			@Override
			boolean isFimDeSemana() {
				return true;
			}

			@Override
			String nome() {
				return "Domingo";
			}
		},
		SEGUNDA {
			@Override
			boolean isFimDeSemana() {
				return false;
			}

			@Override
			String nome() {
				return "Segunda-Feira";
			}
		},
		TERCA {
			@Override
			boolean isFimDeSemana() {
				return false;
			}

			@Override
			String nome() {
				return "Terça-Feira";
			}
		},
		QUARTA {
			@Override
			boolean isFimDeSemana() {
				return false;
			}

			@Override
			String nome() {
				return "Quarta-Feira";
			}
		},
		QUINTA {
			@Override
			boolean isFimDeSemana() {
				return false;
			}

			@Override
			String nome() {
				return "Quinta-Feira";
			}
		},
		SEXTA {
			@Override
			boolean isFimDeSemana() {
				return false;
			}

			@Override
			String nome() {
				return "Sexta-Feira";
			}
		},
		SABADO {
			@Override
			boolean isFimDeSemana() {
				return true;
			}

			@Override
			String nome() {
				return "Sábado";
			}
		};

		abstract String nome();

		abstract boolean isFimDeSemana();

	}
}
