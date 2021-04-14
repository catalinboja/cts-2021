package ro.ase.csie.cts.g1087.dp.facade;

public class Utilizator {
	
	public void login(String userName, String password) {
		System.out.println("Login");
	}
	
	public ProfilJucator getProfil() {
		return new ProfilJucator();
	}
}
