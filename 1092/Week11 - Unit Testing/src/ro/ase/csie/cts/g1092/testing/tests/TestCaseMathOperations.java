package ro.ase.csie.cts.g1092.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1092.testing.models.MathOperations;

public class TestCaseMathOperations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello from the TestCase");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye from the TestCase");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Let's test something");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clean up");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		int a = 5;
		int b = 6;
		int expectedResult = 11;		
		int result = MathOperations.add(a, b);
		assertEquals("Testing adding 2 int values", expectedResult, result);
	}

}
