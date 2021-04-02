package ro.ase.acs.cts;

import ro.ase.acs.cts.documente.InterfataDocument;
import ro.ase.acs.cts.documente.TipDocument;
import ro.ase.acs.cts.factory.DocumentFactory;

public class TestFactory {

	public static void main(String[] args) {
		//creare Factory documente
		DocumentFactory factory = new DocumentFactory();
		
		//creare document text
		InterfataDocument doc1 = DocumentFactory.creareDocument(TipDocument.TEXT, "Factory.txt");
		
		//creare document html
		InterfataDocument doc2 = DocumentFactory.creareDocument(
				TipDocument.HTML, "Factory.html");
		
		System.out.println("Tip document doc1: "+doc1.getTip());
		System.out.println("Tip document doc2: "+doc2.getTip());
		
	}

}
