package ro.ase.cts;

public class Editor {
	//starea curenta a editorului
	IPrintabil stareCurenta;
	
	public Editor(){
		stareCurenta = new StareNormal();
	}
	
	public void setStare(Stare stare){
		if(stare == Stare.NORMAL)
			this.stareCurenta = new StareNormal();
		else
			if(stare == Stare.BOLD)
				this.stareCurenta = new StareBold(this);
			else
				this.stareCurenta = new StareItalic();
	}
	
	public void afisare(String text){
		this.stareCurenta.print(text);
	}
}
