package ro.ase.cts.decorator;

public class TestDecoratorButon {

	public static void main(String[] args) {
		
		AbstractControlVizual butonLogin = new Buton("Login", 1);
		AbstractControlVizual butonGetDate = new Buton("Preia date", 2);
		
		butonLogin.click();
		butonGetDate.click();
		
		System.out.println("----------------------");
		
		//decoram butonul de login cu animatie
		AbstractControlVizual butonLoginCuAnimatie = 
				new DecoratorButonCuAnimatie(butonLogin);
		
		butonLoginCuAnimatie.click();
		
		//decoram butonul de login cu sunet
		AbstractControlVizual butonLoginCuSunet = 
				new DecoratorButonCuSunetSpecial(butonLogin, "Click.wav");
		//butonLoginCuSunet.click();
		
		
		System.out.println("----------------------");
		//decorare cu animatie si sunet
		AbstractControlVizual butonLoginCuAnimatieSiSunet = 
				new DecoratorButonCuSunetSpecial(butonLoginCuAnimatie, "Click2.wav");
		butonLoginCuAnimatieSiSunet.click();
		
		
		//decoram butonul Preia date cu un decorator ad-hoc anonim
		AbstractControlVizual butonGetDateCuAltSunet = 
				new DecoratorAbstractControlVizual(butonGetDate) {
			@Override
			public void click() {
				System.out.println("Zip Zip");
			}
		};
		butonGetDateCuAltSunet.click();
		
		
	}

}
