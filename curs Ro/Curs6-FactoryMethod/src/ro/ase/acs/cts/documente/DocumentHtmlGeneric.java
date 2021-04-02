package ro.ase.acs.cts.documente;

public class DocumentHtmlGeneric extends InterfataDocument{

	@Override
	public String getTip() {
		return "Document HTML";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
