package ro.ase.csie.cts.g1088.dp.builder;

public class SuperErou {

	private String nume;
	private int puncteViata;

	private boolean esteErouNegativ;
	private boolean esteRanit;

	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;

	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;

	private SuperErou() {

	}

	private SuperErou(
			String nume, 
			int puncteViata, 
			boolean esteErouNegativ, 
			boolean esteRanit, 
			InterfataArma armaStanga,
			InterfataArma armaDreapta, 
			InterfataSuperPutere superPutere, 
			InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteErouNegativ = esteErouNegativ;
		this.esteRanit = esteRanit;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	public static class SuperErouBuilder {
		SuperErou superErou = null;
		
		public SuperErouBuilder(String nume, int puncteViata) {
			superErou = new SuperErou();
			superErou.nume = nume;
			superErou.puncteViata = puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteErouNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanit = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.superErou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return superErou;
		}
		
		
	}
	
	

}
