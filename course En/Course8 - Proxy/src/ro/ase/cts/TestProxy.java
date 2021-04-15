package ro.ase.cts;

import ro.ase.cts.proxy.Image;
import ro.ase.cts.proxy.ImageInterface;
import ro.ase.cts.proxy.ImageProxy;
import ro.ase.cts.proxy2.LoginInterface;
import ro.ase.cts.proxy2.Login;
import ro.ase.cts.proxy2.SecureLoginProxy;

public class TestProxy {

	public static void main(String[] args) {
		ImageInterface img1 = 
				new Image("Car.png");
		
		//we do a lot of other things
		System.out.println("Do other stuff");
		
		img1.displayImage();
		img1.displayImage();
		img1.displayImage();
		
        final ImageInterface IMAGE1 = 
        		new ImageProxy("Photo1");
        final ImageInterface IMAGE2 = 
        		new ImageProxy("Photo2");
 
        IMAGE1.displayImage();
        IMAGE1.displayImage();
        IMAGE2.displayImage();
        IMAGE2.displayImage();
        IMAGE1.displayImage();
        
        
        //test exemplu 2
		//brute force attack on user account
		String dictionarParole[] = new String[]{"123456","1234","player1",
				"root","player11234","1234player","1234"}; 
		
		LoginInterface login = new Login();
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
		
		
		
		LoginInterface proxylogin = new SecureLoginProxy(new Login());
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
