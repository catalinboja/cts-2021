package ro.ase.cts;

public class TestTemplate {

	public static void main(String[] args) {
		
		NUnitTesting nUnit = new NUnitTesting();
		JUnitTesting jUnit = new JUnitTesting();
		
		nUnit.test();
		jUnit.test();
	}

}
