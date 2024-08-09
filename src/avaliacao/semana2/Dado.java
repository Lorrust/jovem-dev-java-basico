package avaliacao.semana2;

import java.util.Random;

public class Dado {
	
	Random r = new Random();
	
	public int lancarDado() {
		return r.nextInt(1, 7);
	}

}
