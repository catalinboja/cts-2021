package ro.ase.cts;

public abstract class Tests {
	
	//pasii din template
	public abstract void defineUnitTests();
	public abstract void defineInputData();
	public abstract void defineResults();
	public abstract void runTests();
	public abstract void printTestResults();
	
	//functie template
	public final void testeaza(){
		defineUnitTests();
		defineInputData();
		defineResults();
		runTests();
		printTestResults();
	}
}
