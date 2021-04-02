package ro.ase.acs.cts;

import ro.ase.acs.cts.documente.InterfataDocument;
import ro.ase.acs.cts.documente.TipDocument;

public abstract class AbstractDocumentFactory {
	
	//metoda factory abstracta
	protected abstract InterfataDocument creareDocument(TipDocument tipDocument);
	
	//interfata publica pentru creare documente
	public InterfataDocument newDocument(TipDocument tipDocument, String titlu){
		InterfataDocument document = creareDocument(tipDocument);
		
		//toate documentele au titlu
		if(document!=null)
			document.setTitlu(titlu);
		
		return document;
	}
}


