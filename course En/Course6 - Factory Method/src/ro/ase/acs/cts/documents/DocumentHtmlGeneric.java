package ro.ase.acs.cts.documents;

public class DocumentHtmlGeneric extends DocumentInterface{

	@Override
	public String getType() {
		return "HTML Document";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
