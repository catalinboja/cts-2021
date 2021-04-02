package ro.ase.acs.cts.documente;

public class DocumentText extends InterfataDocument{

	@Override
	public String getTip() {
		// TODO Auto-generated method stub
		return "Text";
	}

	@Override
	public void print(String text) {
		System.out.println("Text:"+text);
	}

}
