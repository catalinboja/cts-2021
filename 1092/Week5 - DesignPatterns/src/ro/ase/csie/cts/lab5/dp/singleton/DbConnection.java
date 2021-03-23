package ro.ase.csie.cts.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	//version 1 - eager approach 
	//private static DbConnection dbConnection = new DbConnection();
	
	//version 2 - lazy approach
	private static DbConnection dbConnection = null;
	
	//class static initializer
	//uses the class lazy-loading approach
	static {
		//executed only once when the class is loaded by the JVM
		System.out.println("Loading database connection string");
	}
	
	//constructor initializer
	{
		//executed before each constructor call
		System.out.println("Init connection string");
	}
	
	private DbConnection() {
		System.out.println("Creating a DB connection");
		
		//access a local settings file to get credentials and conn string
		
	}

	private DbConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	//the method used to return the reference to the unique object
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection == null) {
			//you can get details from files, etc
			dbConnection = new DbConnection();
		}
		return DbConnection.dbConnection;
	}
	
	
}
