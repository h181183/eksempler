package no.hib.dat100;

public enum Ukedag {
	mandag, tirsdag, onsdag, torsdag, fredag, l�rdag, s�ndag;

	public static Ukedag finnDag(int nr) {
		for (Ukedag dag : Ukedag.values()) {
			if (dag.ordinal() == nr) {
				return dag;
			}
		}
		return null; // feil dagnummer
	}

}// class

