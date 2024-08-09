package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.herois.Barbaro;
import avaliacao.semana2.herois.Mago;
import avaliacao.semana2.herois.Paladino;
import avaliacao.semana2.inimigos.Arok;
import avaliacao.semana2.inimigos.Morcego;
import avaliacao.semana2.inimigos.Urso;
import avaliacao.semana2.inimigos.Vampiro;
import avaliacao.semana2.inimigos.Zumbi;

public class Principal {

	public static void main(String[] args) {

		List<Personagem> herois = new ArrayList<>();
		herois.add(new Mago());
		herois.add(new Barbaro());
		herois.add(new Paladino());

		for (Personagem heroi : herois) {
			List<Personagem> inimigos = new ArrayList<>();
			inimigos.add(new Morcego());
			inimigos.add(new Zumbi());
			inimigos.add(new Urso());
			inimigos.add(new Vampiro());
			inimigos.add(new Arok());

			for (Personagem inimigo : inimigos) {
				try {
					Personagem.batalhar(heroi, inimigo);
				} catch (PersonagemDerrotadoException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
