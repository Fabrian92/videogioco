package gioco;

public abstract class PersonaggiAttivit‡Comuni {
	private int exp = 1;
	private int forza;
	private int salute;
	int saluteCattivo;
	int forzaCattivo;
	int pugno;
	int calcio;

	public void corri(int v) {
		int lista[] = new int[v];
		int i;

		for (i = 0; i < lista[v]; i++) {
			lista[i] = i;
			System.out.println(lista[i]);

		}
	}

	public void combattiIlCrimine(int saluteCattivo, int forzaCattivo) {

		do {
			saluteCattivo -= forza;
			salute -= forzaCattivo;
			if (salute > 0 && saluteCattivo <= 0) {
				exp = (exp / 10) * 100;
			}
		} while (saluteCattivo == 0 || salute == 0);
	}

	public boolean colpisciConPugno(int forza, int saluteAvversario) {
		boolean uccidi;
		if (forza > saluteAvversario) {
			uccidi = true;
		} else {
			uccidi = false;
		}

		return uccidi;

	}

	public void caratteristiche() {
		System.out.println(forza);
		System.out.println(salute);

	}

}
