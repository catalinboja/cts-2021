package ro.ase.acs.cts.factory;

import ro.ase.acs.cts.documents.DocumentInterface;
import ro.ase.acs.cts.documents.DocumentType;
import ro.ase.acs.cts.documents.HtmlDocument;
import ro.ase.acs.cts.documents.TextDocument;

public class DocumentFactory {
	
	public static DocumentInterface getDocument(DocumentType docType, String name){
		
		DocumentInterface document = null;
		
		switch(docType){
		case TEXT:
			document = new TextDocument();
			document.setName(name);
			break;
		case HTML:
			String predefinedSet = "UTF8";
			document = new HtmlDocument(name, predefinedSet);
			document.setName(name);
			break;
		}
		
		return document;
	}
}


