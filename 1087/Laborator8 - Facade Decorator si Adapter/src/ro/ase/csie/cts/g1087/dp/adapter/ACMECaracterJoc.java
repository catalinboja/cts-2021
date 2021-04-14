package ro.ase.csie.cts.g1087.dp.adapter;

public abstract class ACMECaracterJoc {
	
	protected String nume;
	protected int puncteViata;
	
	public ACMECaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	
	
	public String getNume() {
		return nume;
	}


	public int getPuncteViata() {
		return puncteViata;
	}

	public abstract void seDeplaseaza();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
	
	
}
