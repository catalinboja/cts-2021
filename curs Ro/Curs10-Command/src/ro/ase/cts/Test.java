package ro.ase.cts;

public class Test {

	public static void main(String[] args) {

		// Receiver
		Bucatar bucatar = new Bucatar("Gigel");
		Bucatar bucatarSupe = new Bucatar("Ionel");

		int numarMasa = 6;
		// Invoker
		Chelner chelner = new Chelner(numarMasa);

		chelner.preiaComanda(
				new ComandaPizza(bucatar, "Taraneasca"));
		chelner.preiaComanda(
				new ComandaPizza(bucatar, "Exotica"));
		chelner.preiaComanda(
				new ComandaSupa(bucatarSupe, "Supa de pui"));

		System.out.println("Wainting");
		chelner.trimiteComenzi();
	}
}
