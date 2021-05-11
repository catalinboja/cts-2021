package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		
		Notepad notepadApp = new Notepad();
		FisierText fisier = new FisierText("Test.txt");
		
		fisier.adaugaText("Ana are mere.");
		fisier.adaugaText("Ana merge la piata.");
		
		notepadApp.addSalvare(fisier.salveaza());
		
		fisier.adaugaText("Este o zi frumoasa.");
		
		notepadApp.addSalvare(fisier.salveaza());
		
		fisier.adaugaText("De primavara.");
		
		fisier.ctrlZ(notepadApp.recupereazaUltimaSalvare());
		fisier.ctrlZ(notepadApp.recupereazaUltimaSalvare());
		fisier.ctrlZ(notepadApp.recupereazaUltimaSalvare());
		
		System.out.println(fisier.getText());
		
	}

}
