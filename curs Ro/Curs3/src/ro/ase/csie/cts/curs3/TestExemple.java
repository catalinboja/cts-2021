package ro.ase.csie.cts.curs3;

import java.util.ArrayList;

import ro.ase.csie.cts.curs3.dip.Contabilitate;
import ro.ase.csie.cts.curs3.dip.Contabilitate2021;
import ro.ase.csie.cts.curs3.liskov.ActiuniStudent;
import ro.ase.csie.cts.curs3.liskov.Profesor;
import ro.ase.csie.cts.curs3.liskov.Student;
import ro.ase.csie.cts.curs3.liskov.StudentMasterat;

public class TestExemple {

	public static void main(String[] args) {
		
		ExempleConventii.comparareStringuri();
		
		//test Liskov
		
		ArrayList<ActiuniStudent> persoane = new ArrayList<>();
		persoane.add(new Student());
		persoane.add(new StudentMasterat());
		persoane.add(new Profesor());
		
		for(ActiuniStudent pers : persoane) {
			
			if(pers instanceof StudentMasterat) {
				System.out.println("Incalcare principiu Liskov pentru StudentMasterat");
			}
			else {
				pers.sustineExamen("CTS");
			}
		}
		
		//DIP
		ro.ase.csie.cts.curs3.dip.Student stud = 
				new ro.ase.csie.cts.curs3.dip.Student(
						"Gigel","CSIE","IE", new Contabilitate());
		stud.platesteTaxa();
		stud.setContabilitate(new Contabilitate2021());
		stud.platesteTaxa();
		
	}

}
