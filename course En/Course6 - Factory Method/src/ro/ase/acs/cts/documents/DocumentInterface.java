package ro.ase.acs.cts.documents;

public abstract class DocumentInterface {
	private String name;
	
	public abstract String getType();
	public abstract void print(String text);
	
	public void setName(String name){
		this.name = name;
	}
}
