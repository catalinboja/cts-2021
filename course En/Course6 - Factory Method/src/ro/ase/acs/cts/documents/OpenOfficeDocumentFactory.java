package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.AbstractDocumentFactory;

public class OpenOfficeDocumentFactory extends AbstractDocumentFactory{

	@Override
	public DocumentInterface createDocument(DocumentType documentType) {
		DocumentInterface document = null;
		
		switch(documentType){
		case TEXT:
			document = new DocumentWordText("",0);
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		case WORD:
			document = new DocumentOpenOfficeText("NewDocument.writer");
			break;
		}
		
		return document;
	}

}
