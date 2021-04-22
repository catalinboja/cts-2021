package ro.ase.cts.proxy2;

public class Login implements LoginInterface {

	@Override
	public boolean login(String username, String password) {
		
		if(username.equals("player1") 
				&& password.equals("1234player"))
			return true;
		else
			return false;
	}

}
