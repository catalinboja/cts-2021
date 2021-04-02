package ro.ase.cts.adaptor.classes;

public class OldJetPrinter implements OldJetPrinterInterface{

	private String idImprimanta;
	
	public void print(String text) {
		System.out.println("Imprimanta: Printing ... "+text);
		
	}

	@Override
	public void cancel() {
		System.out.println("Imprimanta: CANCEL print");
	}

}
