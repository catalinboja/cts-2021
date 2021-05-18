package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.models.MathOperations;

public class TestCaseMathOperations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello !");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye !");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Prepare the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clear after test");
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
		int actualResult = MathOperations.add(a, b);
		assertEquals("Check the addition", expectedResult, actualResult);
	}

}
