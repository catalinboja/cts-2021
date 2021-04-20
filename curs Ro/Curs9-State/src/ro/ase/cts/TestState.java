package ro.ase.cts;

public class TestState {
	
	public static void main(String[] args){
		Editor editor = new Editor();
	
		editor.afisare("Hello World !");
		
		editor.setStare(Stare.BOLD);
		
		editor.afisare("Hello World Java!");
		
		editor.setStare(Stare.ITALIC);
		
		editor.afisare("Salut !");
	}
}
