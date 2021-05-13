package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		
		Notepad notepadApp = new Notepad();
		TextFile file = new TextFile("Test.txt");
		
		file.addText("Hello ! How are you ?");
		file.addText("\nWhere are you going ?.");
		
		notepadApp.addSnapshot(file.save());
		
		file.addText("It's a fine day");
		
		notepadApp.addSnapshot(file.save());
		
		file.addText("Is spring time");
		
		file.ctrlZ(notepadApp.recoverLastVersion());
		file.ctrlZ(notepadApp.recoverLastVersion());
		//file.ctrlZ(notepadApp.recoverLastVersion());
		
		System.out.println(file.getText());
		
	}

}
