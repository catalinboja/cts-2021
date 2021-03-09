package ro.ase.csie.cts.curs3.liskov;

public class Student implements ActiuniStudent, ActiuniInmatriculare{

	@Override
	public void sustineExamen(String examen) {
		System.out.println("Studentul sustine examen la " +  examen);
	}

	@Override
	public void participaCurs(String curs) {
		System.out.println("Studentul participa la cursul " +  curs);
	}

	@Override
	public void inregistrareOnline() {
		// TODO Auto-generated method stub
		
	}

}
