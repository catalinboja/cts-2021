package ro.ase.csie.cts.curs4.dip;

public class ExamenOral implements InterfataExamen {

	@Override
	public void sustineExamen(String numeStudent, String disciplina) {
		System.out.println(
				String.format("Studentul %s sustine examen oral la %s",
						numeStudent, disciplina));
	}

}
