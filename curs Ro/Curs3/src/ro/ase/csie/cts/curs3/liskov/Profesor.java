package ro.ase.csie.cts.curs3.liskov;

public class Profesor implements ActiuniStudent {

	@Override
	public void sustineExamen(String examen) {
		System.out.println("Profesorul pregateste examenul la " + examen);
	}

	@Override
	public void participaCurs(String curs) {
		System.out.println("Profesorul prezinta cursul " +  curs);
	}

}
