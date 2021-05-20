package ro.ase.csie.cts.g1093.testing.models;

import ro.ase.csie.cts.g1093.testing.exceptions.DivisionByZeroException;

public class MathOperations {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double divide(int a, int b) throws DivisionByZeroException {
		if(b == 0) {
			throw new DivisionByZeroException();
		}
		return a / b;
	}
	
}
