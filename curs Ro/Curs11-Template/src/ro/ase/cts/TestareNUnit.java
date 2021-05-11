package ro.ase.cts;

public class TestareNUnit extends Testare{

	@Override
	public void definesteUnitateTestare() {
		System.out.println("NUnit: unitate definita");
	}

	@Override
	public void definesteDateIntrare() {
		System.out.println("NUnit: date intrare");
	}

	@Override
	public void definesteRezultate() {
		System.out.println("NUnit: rezultate");
	}

	@Override
	public void ruleazaUnitate() {
		System.out.println("NUnit: ruleaza");
	}

	@Override
	public void afisareRezultatTest() {
		System.out.println("NUnit: afisare");
	}

}
