package ro.ase.acs.cts;

import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;
import ro.ase.acs.cts.documents.MSOfficeDocumentFactory;
import ro.ase.acs.cts.documents.OpenOfficeDocumentFactory;
import ro.ase.acs.cts.documents.DocumentType;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
/*		DocumentWordText wordDoc = new DocumentWordText();
		DocumentOpenOfficeText openDoc = new DocumentOpenOfficeText();*/
		
		AbstractDocumentFactory docFactory = null;
		
		docFactory = new MSOfficeDocumentFactory();
		//docFactory = new OpenOfficeDocumentFactory();
		
		DocumentWordText wordDoc = 
				(DocumentWordText) docFactory.createDocument(DocumentType.TEXT);
		
	}

}
