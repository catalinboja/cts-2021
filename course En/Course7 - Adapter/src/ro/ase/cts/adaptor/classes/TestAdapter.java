package ro.ase.cts.adaptor.classes;

public class TestAdapter {

	public static void main(String[] args) {

		System.out.println("Class adapter");
		LaserPrinterInterface laser = new PrinterAdapter();
		laser.laserPrint(new String[] {"This","is","a","test"});
		laser.cancelPrint();
		
	}

}
