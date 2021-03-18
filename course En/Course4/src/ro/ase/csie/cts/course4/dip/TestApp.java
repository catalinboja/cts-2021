package ro.ase.csie.cts.course4.dip;

public class TestApp {

	public static void main(String[] args) {
		Student student = new Student("John");
		student.takeExam("OOP");
		
		student.setExam(new QuizExam());
		student.takeExam("OOP");
		
		student.setExam(new ExamInterface() {
			
			@Override
			public void takeExam(String course, String studentName) {
				System.out.println("The exam will require the implementation of an app");
			}
		});
		student.takeExam("OOP");
	}

}
