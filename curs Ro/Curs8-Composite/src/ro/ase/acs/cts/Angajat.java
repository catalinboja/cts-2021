package ro.ase.acs.cts;

public class Angajat extends NodStructuraIerarhica{
	
	String nume;
	String post;
	double salariu;
	
	public Angajat(String nume, String post){
		this.nume = nume;
		this.post = post;
	}
	
	public void setSalariu(double valoare){
		this.salariu = valoare;
	}

	@Override
	public String getNume() {
		return this.nume;
	}

	@Override
	public String getPost() {
		return this.post;
	}

	@Override
	public double getSalariu() {
		return this.salariu;
	}

	/*
	 * @Override public void adaugaNodCopil(NodStructuraIerarhica elementStructura)
	 * { // TODO Auto-generated method stub throw new
	 * UnsupportedOperationException(); }
	 */
}
