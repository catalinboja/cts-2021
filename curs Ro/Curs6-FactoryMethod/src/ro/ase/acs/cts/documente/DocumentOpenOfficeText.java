package ro.ase.acs.cts.documente;

public class DocumentOpenOfficeText extends InterfataDocument{

	@Override
	public String getTip() {
		return "Document OpenOffice de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
