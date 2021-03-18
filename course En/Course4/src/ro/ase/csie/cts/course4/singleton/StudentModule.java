package ro.ase.csie.cts.course4.singleton;

public class StudentModule {
	public StudentModule() {
		//DbConnection dbConnection = new DbConnection("localhost");
		DbConnection dbConnection = DbConnection.getConnection();
	}
}
