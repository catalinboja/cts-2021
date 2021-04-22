package ro.ase.cts;

public class Editor {
	//current state of the editor
	IPrintable currentState;
	
	public Editor(){
		currentState = new StyleNormal();
	}
	
	public void selectBoldOption() {
		this.currentState = new StyleFirstWordBold(this);
	}
	
	public void selectItalicOption() {
		this.currentState = new StyleItalic();
	}
	
	
	public void resetPreferences() {
		this.currentState = new StyleNormal();
	}
	
	public void setStyle(Style style){
		if(style == Style.NORMAL)
			this.currentState = new StyleNormal();
		else
			if(style == Style.BOLD)
				this.currentState = new StyleFirstWordBold(this);
			else
				this.currentState = new StyleItalic();
	}
	
	public void print(String text){
		this.currentState.print(text);
	}

}
