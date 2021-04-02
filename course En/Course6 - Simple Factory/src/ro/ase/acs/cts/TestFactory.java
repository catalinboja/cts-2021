package ro.ase.acs.cts;

import ro.ase.acs.cts.documents.DocumentInterface;
import ro.ase.acs.cts.documents.DocumentType;
import ro.ase.acs.cts.factory.DocumentFactory;

public class TestFactory {

	public static void main(String[] args) {

		DocumentFactory factory = new DocumentFactory();
		

		DocumentInterface doc1 = DocumentFactory.getDocument(DocumentType.TEXT, "Factory.txt");
		
		DocumentInterface doc2 = DocumentFactory.getDocument(
				DocumentType.HTML, "Factory.html");
		
		System.out.println("Tip document doc1: "+doc1.getType());
		System.out.println("Tip document doc2: "+doc2.getType());
		
	}

}
