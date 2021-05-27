package ro.ase.csie.cts.g1088.testare.modele;
import java.util.ArrayList;

import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieVarsta;


public class Student {
	
	public static final int MIN_VARSTA = 14;
	public static final int MAX_VARSTA = 90;
	public static final int MIN_NOTA = 1;
	public static final int MAX_NOTA = 10;
	public static final int MIN_LUNGIME_NUME = 3;
	public static final int MAX_LUNGIME_NUME = 255;
	
	protected String nume;
	protected int varsta;
	protected ArrayList<Integer> note;
	
	
	public Student(String nume, int varsta, ArrayList<Integer> note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) throws ExceptieNume{
		if(nume.length() < MIN_LUNGIME_NUME) {
			throw new ExceptieNume();
		}
		this.nume = nume;
	}


	public int getVarsta() {
		return varsta;
	}


	public void setVarsta(int varsta) throws ExceptieVarsta{
		if(varsta < MIN_VARSTA || varsta > MAX_VARSTA) {
			throw new ExceptieVarsta();
		}
		this.varsta = varsta;
	}


	public void setNote(ArrayList<Integer> note) throws ExceptieNota{
		this.note = note;
	}
	
	
	public int getNota(int index) {
		return this.note.get(index);
	}
	
	public int getNrNote() {
		return this.note.size();
	}
	

	public float getMedie() {
		int sum = 0;
		for(int grade : this.note) {
			sum += grade;
		}
		return sum/this.note.size();
		
	}

    public int getNotaMinima() {
        int min = 0;
        for(int nota : this.note) {
			if(min > nota) {
                min = nota;
            }
		}
        return min;
    }
	
	
}
