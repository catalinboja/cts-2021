package ro.ase.csie.cts.g1094.dp.facade;

public class UserAPIFacade {
	
	public static UserProfile getUserProfile(String serverIp, String userName, String pass) {
		GameServer gameServer = new GameServer();
		gameServer.connect(serverIp);
		if(gameServer.isConnected()) {
			UserAccount user = new UserAccount();
			user.login(userName,pass);
			
			UserProfile profile = user.downloadUserProfile();
			return profile;
		}
		else
			return null;
	}
	
	
}
