package ro.ase.cts;

public class TestState {
	
	public static void main(String[] args){
		Editor editor = new Editor();
	
		editor.print("Hello World !");
		
		editor.selectBoldOption();
		
		editor.print("Hello World Java!");
		
		editor.selectItalicOption();
		
		editor.print("Hello !");
	}
}
