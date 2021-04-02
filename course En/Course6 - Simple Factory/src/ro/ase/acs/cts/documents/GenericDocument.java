package ro.ase.acs.cts.documents;

public class GenericDocument extends DocumentInterface {
	String name;
	String type;
	int property;
	
	public GenericDocument(String name, String type){
		this.name = name;
		this.type = type;
	}
	public GenericDocument(String name, String type, int property){
		this.name = name;
		this.type = type;
		this.property = property;
	}
	@Override
	public String getType() {
		return type;
	}
	@Override
	public void print(String text) {
		System.out.println("Generic document: ");
	}
}
