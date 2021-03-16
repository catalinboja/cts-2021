package ro.ase.csie.cts.curs4.dip;

public class TestDIP {

	public static void main(String[] args) {
		
		//Student student = new Student();
		Student student = new Student("Gigel", new ExamenScris());
		student.sustineExamen("CTS");
		student.setModalitateExamen(new ExamenOral());
		student.sustineExamen("POO");
		
		student.setModalitateExamen(new InterfataExamen() {
			
			@Override
			public void sustineExamen(String numeStudent, String disciplina) {
				System.out.println("Examen grila + interviu la " + disciplina);
			}
		});
		student.sustineExamen("CTS");
	}

}
