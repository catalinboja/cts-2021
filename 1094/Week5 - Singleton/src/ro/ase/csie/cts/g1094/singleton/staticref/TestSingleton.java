package ro.ase.csie.cts.g1094.singleton.staticref;

public class TestSingleton {

	public static void main(String[] args) {
		
		DbConnection con1 = DbConnection.connection;
		DbConnection con2 = DbConnection.connection;
		
		if(con1 == con2) {
			System.out.println("They are the same");
		}
		
		//DbConnection con3 = new DbConnection();
		
	}

}
