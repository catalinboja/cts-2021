package ro.ase.cts.adaptor.clase;

public class ImprimantaMatriceala implements InterfataImprimantaMatriceala{

	private String idImprimanta;
	
	public void print(String text) {
		System.out.println("Imprimanta: Printing ... "+text);
		
	}

	@Override
	public void cancel() {
		System.out.println("Imprimanta: CANCEL print");
	}

}
