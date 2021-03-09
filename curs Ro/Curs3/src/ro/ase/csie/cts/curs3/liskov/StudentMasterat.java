package ro.ase.csie.cts.curs3.liskov;

public class StudentMasterat extends Student {

	@Override
	public void sustineExamen(String examen) {
		System.out.println("Studentul la masterat sustine examen la " +  examen);
	}

	@Override
	public void participaCurs(String curs) {
		System.out.println("Studentul la masterat participa la " + curs);
	}

}
