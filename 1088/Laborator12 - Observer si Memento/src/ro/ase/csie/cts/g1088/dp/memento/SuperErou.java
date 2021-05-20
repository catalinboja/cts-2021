package ro.ase.csie.cts.g1088.dp.memento;

public class SuperErou {

	String nume;
	int puncteViata;
	String magie;
	
	
	public SuperErou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
	}
	
	public void ataca() {
		System.out.println("Ataca");
	}
	
	public void esteLovit(int puncte) {
		this.puncteViata -= puncte;
	}
	
	public void seVindeca(int puncte) {
		this.puncteViata += puncte;
	}
	
	public MementoSuperErou salvare() {
		return new MementoSuperErou(nume, puncteViata, magie);
	}
	
	public void incarcaSalvare(MementoSuperErou memento) {
		this.nume = memento.nume;
		this.puncteViata = memento.puncteViata;
		this.magie = memento.magie;
	}
	
}
