package ro.ase.csie.cts.g1087.dp.simplefactory;

public abstract class SuperErouAbstract {
	String nume;
	int puncteViata;
	
	
	
	public void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}

	public SuperErouAbstract(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public abstract void seDeplaseaza();
}
