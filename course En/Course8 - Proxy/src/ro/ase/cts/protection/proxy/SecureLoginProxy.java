package ro.ase.cts.proxy2;

import java.util.HashMap;

public class SecureLoginProxy implements LoginInterface{

	LoginInterface initialLoginModule = null;
	HashMap<String, Integer> attemptsCounter = new HashMap<>();
	public static final int MAX_ATTEMPTS = 3;
	
	public SecureLoginProxy(LoginInterface modulLogin) {
		this.initialLoginModule = modulLogin;
	}
	
	@Override
	public boolean login(String username, String password) {
		
		Integer noAttempts = attemptsCounter.get(username);
		if(noAttempts == null) {
			attemptsCounter.put(username, 0);
			noAttempts = 0;
		}
		
		//check no of attempts
		if(noAttempts >= MAX_ATTEMPTS)
		{
			//send email ....
			System.out.println("You account is locked for " + username);
			return false;
		}
		
		if(this.initialLoginModule != null) {
			boolean result = 
					this.initialLoginModule.login(username, password);
			if(result == false) {
				noAttempts+=1;
				attemptsCounter.put(username, noAttempts);
			}
			else
			{
				noAttempts = 0;
				attemptsCounter.put(username, noAttempts);
			}
			return result;
		}
		else
			throw new UnsupportedOperationException();
	}

}
