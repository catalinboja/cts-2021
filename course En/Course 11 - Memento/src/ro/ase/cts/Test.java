package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		
		Notepad notepadApp = new Notepad();
		TextFile fisier = new TextFile("Test.txt");
		
		fisier.addText("Hello ! How are you ?");
		fisier.addText("Where are you going ?.");
		
		notepadApp.addSnapshot(fisier.save());
		
		fisier.addText("It's a fine day");
		
		notepadApp.addSnapshot(fisier.save());
		
		fisier.addText("Is spring time");
		
		fisier.ctrlZ(notepadApp.recoverLastVersion());
		fisier.ctrlZ(notepadApp.recoverLastVersion());
		fisier.ctrlZ(notepadApp.recoverLastVersion());
		
		System.out.println(fisier.getText());
		
	}

}
