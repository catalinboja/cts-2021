package ro.ase.cts.proxy2;

import java.util.HashMap;

public class ProxyLoginSecurizat implements InterfataLogin{

	InterfataLogin modulLoginInitial = null;
	HashMap<String, Integer> contorAutentificari = new HashMap<>();
	public static final int MAX_INCERCARI = 3;
	
	public ProxyLoginSecurizat(InterfataLogin modulLogin) {
		this.modulLoginInitial = modulLogin;
	}
	
	@Override
	public boolean login(String username, String password) {
		
		Integer nrIncercari = contorAutentificari.get(username);
		if(nrIncercari == null) {
			contorAutentificari.put(username, 0);
			nrIncercari = 0;
		}
		
		//verific daca a fost depasit numarul de incercari admise
		if(nrIncercari >= MAX_INCERCARI)
		{
			//trimit email ....
			System.out.println("Contul este deja blocat pentru " + username);
			return false;
		}
		
		if(this.modulLoginInitial != null) {
			boolean rezultat = 
					this.modulLoginInitial.login(username, password);
			if(rezultat == false) {
				nrIncercari+=1;
				contorAutentificari.put(username, nrIncercari);
			}
			else
			{
				nrIncercari = 0;
				contorAutentificari.put(username, nrIncercari);
			}
			return rezultat;
		}
		else
			throw new UnsupportedOperationException();
	}

}
