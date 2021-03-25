package ro.ase.acs.cts.singleton.exemplu;

import ro.ase.acs.cts.ConexiuneBD;

public class SingletonConexiuneBD {
	
	private static SingletonConexiuneBD singleConnection = null;
	
	private String socket;
	private String user;
	private String password;
	
	public synchronized static SingletonConexiuneBD getConnection() {
		if(singleConnection == null) {
			singleConnection = 
					new SingletonConexiuneBD("127.0.0.l:3060", "user", "12345678");
		}
		return singleConnection;
	}
	
	
	private SingletonConexiuneBD(String socket, String user, String password) {
		
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
	
	public void open(){
		System.out.println("Conexiune deschisa");
	}
	
	public void close(){
		System.out.println("Conexiune inchisa");
	}
}
