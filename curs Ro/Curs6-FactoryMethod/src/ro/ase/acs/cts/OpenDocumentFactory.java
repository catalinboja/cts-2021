package ro.ase.acs.cts;

import ro.ase.acs.cts.documente.DocumentHtmlGeneric;
import ro.ase.acs.cts.documente.DocumentOpenOfficeText;
import ro.ase.acs.cts.documente.InterfataDocument;
import ro.ase.acs.cts.documente.TipDocument;

public class OpenDocumentFactory extends AbstractDocumentFactory{

	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text specific Open Office
			document = new DocumentOpenOfficeText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		
		return document;
	}

}
