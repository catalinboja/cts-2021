package ro.ase.csie.cts.g1094.singleton;

public class DbConnection {
	
	String connString;
	String schema;
	
	private static DbConnection connection = null;
	
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration.....");
		this.connString = "127.0.0.1:1443";
		this.schema = "cts";
	}

	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	public static DbConnection getConnection() {
		if(DbConnection.connection == null) {
			connection = new DbConnection();
		}
		return DbConnection.connection;
	}
	
	//it's not clean
	//it's misleading - others will think they have multiple connection
	public static DbConnection getConnection(String connString, String schema) {
		if(DbConnection.connection == null) {
			connection = new DbConnection(connString, schema);
		}
		return DbConnection.connection;
	}

}
