package ro.ase.cts;

public class JUnitTesting extends Tests{
	@Override
	public void defineUnitTests() {
		System.out.println("JUnit: unit test defined");
	}

	@Override
	public void defineInputData() {
		System.out.println("JUnit: input data");
	}

	@Override
	public void defineResults() {
		System.out.println("JUnit: results");
	}

	@Override
	public void runTests() {
		System.out.println("JUnit: run");
	}

	@Override
	public void printTestResults() {
		System.out.println("JUnit: print");
	}

}
