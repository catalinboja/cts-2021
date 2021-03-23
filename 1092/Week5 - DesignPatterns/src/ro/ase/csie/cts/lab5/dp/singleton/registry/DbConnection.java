package ro.ase.csie.cts.lab5.dp.singleton.registry;

import java.util.HashMap;

import com.sun.tools.jconsole.JConsoleContext.ConnectionState;

public class DbConnection {
	
	String socket;
	String schema;
	
	private static HashMap<String,DbConnection> connections = new HashMap<>();
	
	private DbConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	public static DbConnection getConnection(String socket, String schema) {
		//we use the socket as the key
		DbConnection connection = 
				connections.get(socket);
		if(connection == null) {
			connection = new DbConnection(socket, schema);
			connections.put(socket, connection);
		}
		
		return connection;
	}

}
