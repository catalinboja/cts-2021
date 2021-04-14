package ro.ase.csie.cts.g1087.dp.facade;

public class APIJocFacade {
	
	public static ProfilJucator getProfil(String ipServer, int port, 
			String numeUtilizator, String parola) {
		ServerJoc server = new ServerJoc(ipServer, port);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login(numeUtilizator, parola);
			ProfilJucator profil = utilizator.getProfil();
			return profil;
		}
		else
			return null;
	}
	
}
