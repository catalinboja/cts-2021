package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract {
	
	String culoare;
	boolean okPentruCopiiMici = true;
	
	public CaracterDisney(String culoare, String nume) {
		this.nume = nume;
		this.culoare = culoare;
	}

	@Override
	public void alearga() {
		System.out.println("Alearga....");
	}

	@Override
	public void sare() {
		System.out.println("Sare....");
	}
	
	

}
