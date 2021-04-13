package ro.ase.acs.cts;

public abstract class NodStructuraIerarhica {
	
	//interfata publica pentru atributele unui nod
	public abstract String getNume();
	public abstract String getPost();
	public abstract double getSalariu();
	
	//metoda pentru afisarea datelor unui angajat
	public String getInfo(){
		return this.getNume() + " - "+ this.getPost();
	}
	
	//interfata publica pentru gestiunea colectiei de noduri copil
	
	//metoda pentru a adauga un nod la structura ierarhica
	public void adaugaNodCopil(NodStructuraIerarhica elementStructura){
		throw new UnsupportedOperationException();
	}
	
	//public abstract void adaugaNodCopil(NodStructuraIerarhica elementStructura);
	
	//metoda pentru a sterge un nod din structura ierarhica
	public void stergeNodCopil(NodStructuraIerarhica elementStructura){
		throw new UnsupportedOperationException();
	}
	
	//metoda pentru a extrage un nod din structura ierarhica
	public NodStructuraIerarhica getNodCopil(int i){
		throw new UnsupportedOperationException();
	}
	
}
