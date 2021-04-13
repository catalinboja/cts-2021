package ro.ase.cts;

import ro.ase.cts.proxy.Imagine;
import ro.ase.cts.proxy.InterfataImagine;
import ro.ase.cts.proxy.ProxyImagine;
import ro.ase.cts.proxy2.InterfataLogin;
import ro.ase.cts.proxy2.Login;
import ro.ase.cts.proxy2.ProxyLoginSecurizat;

public class TestProxy {

	public static void main(String[] args) {
		InterfataImagine img1 = 
				new Imagine("Car.png");
		
		//we do a lot of other things
		System.out.println("Do other stuff");
		
		img1.afisareImagine();
		img1.afisareImagine();
		img1.afisareImagine();
		
        final InterfataImagine IMAGE1 = 
        		new ProxyImagine("Photo1");
        final InterfataImagine IMAGE2 = 
        		new ProxyImagine("Photo2");
 
        IMAGE1.afisareImagine();
        IMAGE1.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE1.afisareImagine();
        
        
        //test exemplu 2
		//exemplu atac brute force pe contul unui jucator
		String dictionarParole[] = new String[]{"123456","1234","player1",
				"root","player11234","1234player","1234"}; 
		
		InterfataLogin login = new Login();
		int nrIncercari = 0;
		for(String parola : dictionarParole) {
			nrIncercari += 1;
			if(login.login("player1", parola)) {
				System.out.println("Parola gasita : " + parola);
				System.out.println("Numar incercari: " + nrIncercari);
				break;
			}
		}
		
		System.out.println("Sesiune terminata");
		
		
		
		InterfataLogin proxylogin = new ProxyLoginSecurizat(new Login());
		nrIncercari = 0;
		for(String parola : dictionarParole) {
			nrIncercari += 1;
			if(proxylogin.login("player1", parola)) {
				System.out.println("Parola gasita : " + parola);
				System.out.println("Numar incercari: " + nrIncercari);
				break;
			}
		}
		
		System.out.println("Sesiune terminata");
	}

}
