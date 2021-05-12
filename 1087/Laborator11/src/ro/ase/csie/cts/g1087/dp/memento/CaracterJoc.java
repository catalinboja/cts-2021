package ro.ase.csie.cts.g1087.dp.memento;

public class CaracterJoc {
	
	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	public CaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncteViata = puncteViata;
		this.abilitatiMagice = abilitatiMagice;
	}

	public void ataca() {
		
	}
	
	public void seVindeca(int valoare) {
		this.puncteViata += valoare;
	}
	
	public void seDeplaseaza() {
		
	}
	
	public MementoCaracterJoc salvare() {
		return new MementoCaracterJoc(denumire, puncteViata, abilitatiMagice);
	}
	
	public void incarcaSalvare(MementoCaracterJoc salvare) {
		this.denumire = salvare.denumire;
		this.puncteViata = salvare.puncteViata;
		this.abilitatiMagice = salvare.abilitatiMagice;
	}
	
}
