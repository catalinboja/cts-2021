package ro.ase.acs.cts.documente;

import ro.ase.acs.cts.AbstractDocumentFactory;

public class MSDocumentFactory extends AbstractDocumentFactory{

	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text de tip Word - specific generatorului
			document = new DocumentWordText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		
		return document;
	}
}
