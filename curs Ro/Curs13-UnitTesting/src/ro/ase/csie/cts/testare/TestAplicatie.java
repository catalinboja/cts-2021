package ro.ase.csie.cts.testare;

import java.util.ArrayList;

public class TestAplicatie {

	public static void main(String[] args) {
		
		ArrayList<Integer> note = new ArrayList<>();
		note.add(5);
		note.add(5);
		note.add(10);
		
		Student student1 = new Student("Gigel", 21, note);
		Student student2 = new Student("Ana", 21, note);
		
		student1.sustineExamen(0, 7);
		
		System.out.println(student2.getNota(0));
		
		note.set(1, 10);
		System.out.println(student1.getNota(1));
	}

}
