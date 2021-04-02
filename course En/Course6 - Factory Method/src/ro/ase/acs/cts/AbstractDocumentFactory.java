package ro.ase.acs.cts;

import ro.ase.acs.cts.documents.DocumentInterface;
import ro.ase.acs.cts.documents.DocumentType;

public abstract class AbstractDocumentFactory {
	
	protected abstract DocumentInterface createDocument(DocumentType documentType);
	
	public DocumentInterface newDocument(DocumentType documentType, String name){
		DocumentInterface document = createDocument(documentType);
		
		if(document!=null)
			document.setName(name);
		
		return document;
	}
}


