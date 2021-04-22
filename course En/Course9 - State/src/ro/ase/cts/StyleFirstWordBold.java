package ro.ase.cts;

public class StyleFirstWordBold implements IPrintable{

	Editor textEditor;
	
	public StyleFirstWordBold(Editor editor) {
		this.textEditor = editor;
	}
	
	@Override
	public void print(String text) {
		
		String firstWord = text.split(" ")[0];
		System.out.println("Bold: "+firstWord);
		
		//make the transition to a new state
		this.textEditor.setStyle(Style.NORMAL);
		this.textEditor.print(text.replace(firstWord+" ", ""));
	}

}
