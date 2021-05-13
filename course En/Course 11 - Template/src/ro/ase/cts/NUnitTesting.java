package ro.ase.cts;

public class NUnitTesting extends Tests{

	@Override
	public void defineUnitTests() {
		System.out.println("NUnit: define unit tests");
	}

	@Override
	public void defineInputData() {
		System.out.println("NUnit: input data");
	}

	@Override
	public void defineResults() {
		System.out.println("NUnit: results");
	}

	@Override
	public void runTests() {
		System.out.println("NUnit: run");
	}

	@Override
	public void printTestResults() {
		System.out.println("NUnit: print");
	}

}
