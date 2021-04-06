package ro.ase.cts.adaptor.clase;

public class TestAdapter {

	public static void main(String[] args) {

		System.out.println("Exemplu adaptor clase");
		InterfataImprimantaLaser laser = new AdaptorImprimanta();
		laser.laserPrint(new String[] {"Acesta","este","un","test"});
		laser.cancelPrint();
		
	}

}
