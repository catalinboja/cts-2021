package ro.ase.cts.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		AbstractVisualControl butonLogin = new Button("Login", 1);
		AbstractVisualControl butonGetDate = new Button("Get data", 2);
		
		butonLogin.click();
		butonGetDate.click();
		
		System.out.println("----------------------");
		
		//add animation
		AbstractVisualControl butonLoginCuAnimatie = 
				new DecoratorWithAnimation(butonLogin);
		
		butonLoginCuAnimatie.click();
		
		//add sound effects
		AbstractVisualControl butonLoginCuSunet = 
				new DecoratorWithSoundEffect(butonLogin, "Click.wav");
		butonLoginCuSunet.click();
		
		//add an ad-hoc decorator
		AbstractVisualControl butonGetDateCuAltSunet = 
				new AbstractDecoratorForControls(butonGetDate) {
			@Override
			public void click() {
				System.out.println("Zip Zip");
			}
		};
		butonGetDateCuAltSunet.click();
		
		
	}

}
