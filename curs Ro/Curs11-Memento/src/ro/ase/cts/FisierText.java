package ro.ase.cts;

//Originator

public class FisierText {

	private StringBuilder continut;
	private String nume;
	
	public FisierText(String nume){
		this.continut = new StringBuilder();
		this.nume = nume;
	}
	
	public void adaugaText(String text){
		continut.append(text);
	}
	
    public TextMemento salveaza() {
        System.out.println("Salvare stare text");
        return new TextMemento(this.continut.toString());
    }
    
    public void ctrlZ(TextMemento salvare){
    	this.continut = new StringBuilder();
    	this.continut.append(salvare.getTextSalvat());
    }
    
    public String getText(){
    	return this.continut.toString();
    }
	
}
