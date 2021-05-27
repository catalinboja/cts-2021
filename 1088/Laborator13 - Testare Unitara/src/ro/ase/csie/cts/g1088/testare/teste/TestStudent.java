package ro.ase.csie.cts.g1088.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1088.testare.modele.Student;

public class TestStudent {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial = "Gigel";
	static int varstaInitiala = 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		note = new ArrayList<>();
		note.add(9);
		note.add(7);
		note.add(10);	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}
	
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetVarstaConformanceRight() throws ExceptieVarsta {
		int varstaNoua = 23;
		student.setVarsta(varstaNoua);		
		assertEquals("Test cu valori corecte",varstaNoua, student.getVarsta());
	}
	
	@Test
	public void testSetNumeRight() {
		String numeNou = "Ana";
		try {
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte",numeNou, student.getNume());
		} catch (ExceptieNume e) {
			fail("Genereaza exceptie pentru valori corecte");
		}
	}
	
	@Test
	public void testSetVarstaErrorCondition() {
		int varstaNoua = Student.MIN_VARSTA - 1;
		try {
			student.setVarsta(varstaNoua);
			fail("NU genereaza exceptie pentru varsta in afara limitelor");
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	
	@Test(expected = ExceptieNume.class)
	public void testSetNumeErrorCondition() throws ExceptieNume {
		String numeNou = "Io";
		student.setNume(numeNou);
	}

}
