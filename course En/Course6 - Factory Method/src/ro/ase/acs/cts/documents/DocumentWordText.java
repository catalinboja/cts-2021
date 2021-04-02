package ro.ase.acs.cts.documents;

public class DocumentWordText extends DocumentInterface {

	public DocumentWordText(String title, int vb) {
		this.setName(title);
	}
	
	@Override
	public String getType() {
		return "MSWord Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
