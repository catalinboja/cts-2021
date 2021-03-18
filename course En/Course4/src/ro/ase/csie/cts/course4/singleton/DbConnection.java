package ro.ase.csie.cts.course4.singleton;

public class DbConnection {
	
	private static DbConnection theConnection = null;
	
	String serverName;
	String userAcc;
	String pass;
	
	//class static constructor
	//executed only once 
	static {
		System.out.println("Initializing the unique conenction");
		theConnection = new DbConnection("10.1.1.10");
	}
	
	private DbConnection(String serverName) {
		this.serverName = serverName;
		System.out.println("Creating a DB connection to " + serverName);
	}
	
	
	public static DbConnection getConnection() {
		return theConnection;
	}
	

	private DbConnection(String serverName, String userAcc, String pass) {
		this.serverName = serverName;
		this.userAcc = userAcc;
		this.pass = pass;
	}



	public void connect() {
		System.out.println("Connecting....");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting.");
	}
	
	public void sendSQLCommand() {
		System.out.println("Doing a SELECT");
	}
	
}
