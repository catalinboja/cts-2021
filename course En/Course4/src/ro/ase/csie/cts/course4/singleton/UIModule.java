package ro.ase.csie.cts.course4.singleton;

public class UIModule {

	public UIModule() {
		//DbConnection dbConnection = new DbConnection("localhost");
		DbConnection dbConnection = DbConnection.getConnection();
	}
}
