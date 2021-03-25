package ro.ase.acs.cts.singleton.registry;

import java.util.HashMap;

import ro.ase.acs.cts.ConexiuneBD;

public class SingletonDBConnectionCollection {

	private static HashMap<String, SingletonDBConnectionCollection> singletons = new HashMap<>();

	private String socket;
	private String user;
	private String password;

	public synchronized static SingletonDBConnectionCollection getConnection(String type) {

		SingletonDBConnectionCollection reference;

		switch (type) {
		case "TESTINGDB": {
			reference = singletons.get(type);
			if (reference == null) {
				reference = new SingletonDBConnectionCollection("127.0.0.l:3060", "test", "12345678");
				singletons.put(type, reference);
			}
			break;
		}
		case "PRODDB": {
			reference = singletons.get(type);
			if (reference == null) {
				reference = new SingletonDBConnectionCollection("10.0.0.l:3060", "production", "1234");
				singletons.put(type, reference);
			}
			break;
		}
		default: {
			throw new UnsupportedOperationException();
		}
		}

		return reference;
	}

	private SingletonDBConnectionCollection(String socket, String user, String password) {

		System.out.println("Conexiune DB creata !");

		this.socket = socket;
		this.user = user;
		this.password = password;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void open() {
		System.out.println("Conexiune deschisa");
	}

	public void close() {
		System.out.println("Conexiune inchisa");
	}
}
