package ro.ase.csie.cts.course3.framework;

public class TestLiskov {
	
	public static void walk(ActionsInterface entity) {
		entity.walk();
	}

	public static void main(String[] args) {
		
		//for Persons
		Person person = new Person();
		walk(person);
		
		//for Students
		Student student = new Student();
		walk(student);
		
	}

}
