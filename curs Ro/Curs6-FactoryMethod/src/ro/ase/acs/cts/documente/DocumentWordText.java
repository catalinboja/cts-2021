package ro.ase.acs.cts.documente;

public class DocumentWordText extends InterfataDocument {

	@Override
	public String getTip() {
		return "Document MSWord de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
