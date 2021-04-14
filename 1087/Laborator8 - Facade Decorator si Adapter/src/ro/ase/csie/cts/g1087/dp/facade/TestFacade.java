package ro.ase.csie.cts.g1087.dp.facade;

public class TestFacade {

	public static void main(String[] args) {

		ServerJoc server = new ServerJoc("10.0.0.1", 3306);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("Player 1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
		}
		
		ProfilJucator profil2 = APIJocFacade.getProfil("10.0.0.1", 3306, 
				"Player 2", "123456");
		String dateProfil2 = profil2.getDateProfil();
		
	}

}
