package ro.ase.csie.cts.g1094.singleton.registry;

public class TestRegistry {

	public static void main(String[] args) {
		
		DbConnection con1 = DbConnection.getDbConnection("127.0.0.1", "devDB");
		DbConnection con2 = DbConnection.getDbConnection("127.0.0.1", "devDB");
		
		if(con1 == con2) {
			System.out.println("They are the same");
		}
		
		DbConnection con3 = DbConnection.getDbConnection("10.0.0.1", "prodDb");
		
		if(con2 != con3) {
			System.out.println("They are different");
		}
		
		DbConnection con4 = DbConnection.getDbConnection("89.0.0.1", "prodDb");
		
	}

}
