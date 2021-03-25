package ro.ase.acs.cts;

public class ConexiuneBD {
	
	private String socket;
	private String user;
	private String password;
	
	
	public ConexiuneBD(String socket, String user, String password) {
		
		System.out.println("Create DB connection !");
		
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
		System.out.println("Open connection");
	}
	
	public void close(){
		System.out.println("Close connection");
	}
}
