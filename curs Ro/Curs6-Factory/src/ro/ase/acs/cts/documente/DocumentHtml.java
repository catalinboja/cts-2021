package ro.ase.acs.cts.documente;

public class DocumentHtml extends InterfataDocument{

	public DocumentHtml(String titlu) {
		this.setTitlu(titlu);
	}
	
	@Override
	public String getTip() {
		return "Document HTML";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
