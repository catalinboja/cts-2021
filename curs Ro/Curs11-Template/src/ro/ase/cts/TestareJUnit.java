package ro.ase.cts;

public class TestareJUnit extends Testare{
	@Override
	public void definesteUnitateTestare() {
		System.out.println("JUnit: unitate definita");
	}

	@Override
	public void definesteDateIntrare() {
		System.out.println("JUnit: date intrare");
	}

	@Override
	public void definesteRezultate() {
		System.out.println("JUnit: rezultate");
	}

	@Override
	public void ruleazaUnitate() {
		System.out.println("JUnit: ruleaza");
	}

	@Override
	public void afisareRezultatTest() {
		System.out.println("JUnit: afisare");
	}

}
