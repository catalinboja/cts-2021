package ro.ase.csie.cts.curs4.dip;

public class Student {
	
	String nume = "Anonim";
	int grupa;
	String facultate;
	
	InterfataExamen examen = null;
	
	public Student(String nume, InterfataExamen examen) {
		if(examen == null) {
			throw new NullPointerException();
		}
		this.nume = nume;
		this.examen = examen;
	}
	
	public void setModalitateExamen(InterfataExamen examen) {
		if(examen == null) {
			throw new NullPointerException();
		}
		this.examen = examen;
	}
	
	public void sustineExamen(String disciplina) {
		//System.out.println(
		//String.format("Studentul %s sustine examen scris la %s",
		//this.nume, disciplina));
		
		//call-back
		if(this.examen == null) {
			throw new NullPointerException();
		}
		examen.sustineExamen(this.nume, disciplina);
	}

}
