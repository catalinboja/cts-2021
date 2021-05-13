package ro.ase.cts;

//Originator

public class TextFile {

	private StringBuilder content;
	private String name;
	
	public TextFile(String name){
		this.content = new StringBuilder();
		this.name = name;
	}
	
	public void addText(String text){
		content.append(text);
	}
	
    public TextMemento save() {
        System.out.println("Salvare stare text");
        return new TextMemento(this.content.toString());
    }
    
    public void ctrlZ(TextMemento savedImage){
    	this.content = new StringBuilder();
    	this.content.append(savedImage.getVersionContent());
    }
    
    public String getText(){
    	return this.content.toString();
    }
	
}
