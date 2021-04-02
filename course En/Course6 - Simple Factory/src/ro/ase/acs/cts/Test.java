package ro.ase.acs.cts;

import ro.ase.acs.cts.documents.GenericDocument;
import ro.ase.acs.cts.documents.HtmlDocument;
import ro.ase.acs.cts.documents.TextDocument;

public class Test {
	
	public static void main(String[] args) {
		
		GenericDocument d1 = new GenericDocument("Test.txt","generic");
		System.out.println("A document has been created");
		
		HtmlDocument d2 = new HtmlDocument("Test2.html", "UTF8");
		TextDocument d3 = new TextDocument();
		
	}
}
