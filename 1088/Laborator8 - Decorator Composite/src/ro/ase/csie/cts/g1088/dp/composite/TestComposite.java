package ro.ase.csie.cts.g1088.dp.composite;

public class TestComposite {
	public static void main(String[] args) {
		
		UnitateAbstractaJoc grup1 = new GrupCaractere();
		UnitateAbstractaJoc grup2 = new GrupCaractere();
		
		grup1.adaugaCaracter(new CaracterNPC("Soldat", 100));
		grup1.adaugaCaracter(new CaracterNPC("Soldat", 100));
		
		grup2.adaugaCaracter(new CaracterNPC("Soldat", 100));
		grup2.adaugaCaracter(new CaracterNPC("Tanc", 300));
		
		UnitateAbstractaJoc grupNivel = new GrupCaractere();
		grupNivel.adaugaCaracter(new CaracterNPC("Level Boss", 500));
		grupNivel.adaugaCaracter(grup1);
		grupNivel.adaugaCaracter(grup2);
		
		grupNivel.atacaJucator(200);
		grupNivel.seRetrage();
		
	}
}
