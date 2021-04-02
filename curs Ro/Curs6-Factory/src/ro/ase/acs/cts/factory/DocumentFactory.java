package ro.ase.acs.cts.factory;

import ro.ase.acs.cts.documente.DocumentHtml;
import ro.ase.acs.cts.documente.DocumentText;
import ro.ase.acs.cts.documente.InterfataDocument;
import ro.ase.acs.cts.documente.TipDocument;

public class DocumentFactory {
	
	public static InterfataDocument creareDocument(TipDocument tipDocument, String titlu){
		
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			document = new DocumentText();
			document.setTitlu(titlu);
			break;
		case HTML:
			document = new DocumentHtml(titlu);
			//document.setTitlu(titlu);
			break;
		default:
				throw new UnsupportedOperationException();
		}
		
		return document;
	}
}


