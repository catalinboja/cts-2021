package ro.ase.cts;

public abstract class Tests {
	
	//define the steps
	public abstract void defineUnitTests();
	public abstract void defineInputData();
	public abstract void defineResults();
	public abstract void runTests();
	public abstract void printTestResults();
	
	//template method
	public final void test(){
		defineUnitTests();
		defineInputData();
		defineResults();
		runTests();
		printTestResults();
	}
}
