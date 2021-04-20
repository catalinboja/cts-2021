package ro.ase.cts;

public class StareBold implements IPrintabil{

	Editor editorParinte;
	
	public StareBold(Editor editor) {
		this.editorParinte = editor;
	}
	
	@Override
	public void print(String text) {
		String primulCuvant = text.split(" ")[0];
		System.out.println("Bold: "+primulCuvant);
		this.editorParinte.setStare(Stare.NORMAL);
		this.editorParinte.afisare(text.replace(primulCuvant+" ", ""));
	}

}
