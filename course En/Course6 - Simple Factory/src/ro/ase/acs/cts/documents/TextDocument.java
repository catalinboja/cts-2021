package ro.ase.acs.cts.documents;

public class TextDocument extends DocumentInterface{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Text";
	}

	@Override
	public void print(String text) {
		System.out.println("Text:"+text);
	}

}
