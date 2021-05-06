package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {
	
	int totalOreJucate;
	String nume;
	int clasaJucator;
	
	InterfataStrategieMarketing strategieMk = null;
	
	public Jucator(int totalOreJucate, String nume, int clasaJucator) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.clasaJucator = clasaJucator;
	}

	public int getTotalOreJucate() {
		return totalOreJucate;
	}

	public String getNume() {
		return nume;
	}

	public int getClasaJucator() {
		return clasaJucator;
	}

	public void setStrategieMk(InterfataStrategieMarketing strategieMk) {
		this.strategieMk = strategieMk;
	}


	public void acordaPuncteBonus() {
		if(this.strategieMk != null) {
			this.strategieMk.aplicaStrategieBonus(this);
		}
		else
			throw new UnsupportedOperationException();
	}
	
}
