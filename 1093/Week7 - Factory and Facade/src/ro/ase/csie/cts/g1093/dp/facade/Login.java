package ro.ase.csie.cts.g1093.dp.facade;

public class Login {
	String username;
	String pass;
	
	
	public Login(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	
	public void  login() {
		
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}
	
	
}
