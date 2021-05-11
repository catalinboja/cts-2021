package ro.ase.cts;

public class TestTemplate {

	public static void main(String[] args) {
		
		TestareNUnit nUnit = new TestareNUnit();
		TestareJUnit jUnit = new TestareJUnit();
		
		nUnit.testeaza();
		jUnit.testeaza();
	}

}
