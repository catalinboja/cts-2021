package ro.ase.acs.cts.documents;

public class HtmlDocument extends DocumentInterface{

	public HtmlDocument(String name, String charactersSet) {
		this.setName(name);
	}
	
	@Override
	public String getType() {
		return "HTML document";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
