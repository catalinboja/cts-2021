package ro.ase.acs.cts.documente;

public class DocumentGeneric {
	String denumire;
	int tip;
	int atribut;
	
	public DocumentGeneric(String denumire, int tip){
		this.denumire = denumire;
		this.tip = tip;
	}
	public DocumentGeneric(String denumire, int tip, int atribut){
		this.denumire = denumire;
		this.tip = tip;
		this.atribut = atribut;
	}
}
