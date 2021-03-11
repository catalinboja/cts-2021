package ro.ase.csie.cts.course3.entities;

public class Student {
	
	//boolean noScholarship;
	boolean hasScholarship;
	boolean isEnrolled;
	int age;
	int enrollmentYear;

	
	
	void payTax(){ }			//depends on Accounting
	void takeOOPExam(){ }		//depends on the prof
	void saveToDB(){ }			//depends on the DB Admin

	
	void incrementAge() {
		if(this.age < 20) {
			this.age += 1;
		}
		else {
			this.age += 2;
		}
		
		
		this.age = (this.age < 20) ? (this.age += 1) : (this.age += 2);
	}
	
	String getInfo() {
		
		String message;
		
		//test for false
		if(!this.hasScholarship) {
			//do something
		}
		
		//test for true
		if(this.hasScholarship) {
			return "The student has a scholarship";
		}
		else {
			return "No scholarship";
		}
		
	}
	
	public int aSimpleFunction() {
		return 10;
	}
	
	
	
}
