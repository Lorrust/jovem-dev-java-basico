package avaliacao.semana2;

public abstract class Personagem {

	String nome;
	int maxHP;
	int hp;
	int ataque;
	int defesa;

	public Personagem(String nome, int maxHP, int ataque, int defesa) {
		super();
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = maxHP;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public static void batalhar(Personagem atacante, Personagem defensor) throws PersonagemDerrotadoException {

		Dado dado = new Dado();

		System.out.println("\n" + atacante.getNome() + " vs. " + defensor.getNome());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (atacante.getHp() > 0 && defensor.getHp() > 0) {

//			ATAQUE
			System.out.println("\nVez de " + atacante.getNome());

			int dadoAtaque = dado.lancarDado();
			System.out.println("Tirou " + dadoAtaque + " no Dado!");
			int ataque = atacante.getAtaque() + dadoAtaque;
			System.out.println("Ataque: " + ataque);
			if (ataque > defensor.getDefesa()) {
				System.out.println("Acertou!");
				int dano = ataque - defensor.getDefesa();
				System.out.println(defensor.getNome() + " Toma " + dano + " de Dano!");
				defensor.setHp(defensor.getHp() - dano);
				System.out
						.println("Vida de " + defensor.getNome() + ": " + defensor.getHp() + "/" + defensor.getMaxHP());

			} else {
				System.out.println(atacante.getNome() + " Errou!");
			}

			if (defensor.getHp() <= 0) {
				throw new PersonagemDerrotadoException(
						"\n" + defensor.getNome() + " foi Derrotado por " + atacante.getNome() + "!");
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			DEFESA
			System.out.println("\nVez de " + defensor.getNome());

			int dadoDefesa = dado.lancarDado();
			System.out.println("Tirou " + dadoDefesa + " no Dado!");
			int defesa = defensor.getAtaque() + dadoDefesa;
			System.out.println("Ataque: " + defesa);
			if (defesa > atacante.getDefesa()) {
				System.out.println("Acertou!");
				int dano = defesa - atacante.getDefesa();
				System.out.println(atacante.getNome() + " Toma " + dano + " de Dano!");
				atacante.setHp(atacante.getHp() - dano);
				System.out
						.println("Vida de " + atacante.getNome() + ": " + atacante.getHp() + "/" + atacante.getMaxHP());

			} else {
				System.out.println(defensor.getNome() + " Errou!");
			}

			if (atacante.getHp() <= 0) {
				throw new PersonagemDerrotadoException(
						"\n" + atacante.getNome() + " foi Derrotado por " + defensor.getNome() + "!");
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String getNome() {
		return nome;
	}

	private int getMaxHP() {
		return maxHP;
	}

	private int getHp() {
		return hp;
	}

	private void setHp(int hp) {
		this.hp = hp;
	}

	private int getAtaque() {
		return ataque;
	}

	private int getDefesa() {
		return defesa;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", maxHP=" + maxHP + ", hp=" + hp + ", ataque=" + ataque + ", defesa="
				+ defesa + "]";
	}

}
