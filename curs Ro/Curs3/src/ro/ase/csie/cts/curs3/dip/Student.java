package ro.ase.csie.cts.curs3.dip;

public class Student{
	
	String nume;
	String facultate;
	String programLicenta;
	
	InterfataContabilitate conta;
	InterfataPOO poo;
	InterfataBD bd;
	
	//adaug un nou atribut
	//String adresa;
	
	public Student(String nume, String facultate, String licenta,
			InterfataContabilitate conta) {
		this.conta = conta;
	}
	
	public void setContabilitate(InterfataContabilitate conta) {
		this.conta = conta;
	}
	
	
	public void platesteTaxa(){
		//System.out.println("Este platita o taxa de 50 RON");
		
		if(this.conta == null) {
			throw new UnsupportedOperationException();
		}
		this.conta.platesteTaxa();
	}
	void sustineExamenPOO(){
		//System.out.println("Este sustinut examen grila pe platforma online.ase.ro");
	}
	void salvareBazaDate(){
		//System.out.println("Este salvat numele studentului in BD");
	}
}

