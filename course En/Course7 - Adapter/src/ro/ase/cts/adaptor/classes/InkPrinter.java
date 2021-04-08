package ro.ase.cts.adaptor.classes;

public class InkPrinter implements InkPrinterInterface{

	private String idPrinter;
	
	public void print(String text) {
		System.out.println("Printer: Printing ... "+text);
		
	}

	@Override
	public void cancel() {
		System.out.println("Printer: CANCEL print");
	}

}
