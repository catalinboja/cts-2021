package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.AbstractDocumentFactory;

public class MSOfficeDocumentFactory extends AbstractDocumentFactory{

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
			document = new DocumentOpenOfficeText("NewDocument.docx");
			break;
		}
		
		return document;
	}
}
