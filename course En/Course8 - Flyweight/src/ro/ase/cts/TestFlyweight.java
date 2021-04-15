package ro.ase.cts;

public class TestFlyweight {
	
	
	private static Character[] textCharacters = new Character[100];
	private static CaracterContext[] charactersLocations = new CaracterContext[100];
	private static int noCharacters = 0;
	
	public static void pressKey(String character, int location, CharacterFactory characterFactory){
		textCharacters[noCharacters] = characterFactory.getCaracter(character);
		charactersLocations[noCharacters] = new CaracterContext(location);
		noCharacters++;
	}
	

	public static void main(String[] args) {

		CharacterFactory caracterFactory  = new CharacterFactory();
		pressKey("a", noCharacters, caracterFactory);
		pressKey("a", noCharacters, caracterFactory);
		pressKey("a", noCharacters, caracterFactory);
		pressKey("a", noCharacters, caracterFactory);
		pressKey("b", noCharacters, caracterFactory);
		pressKey("b", noCharacters, caracterFactory);
		pressKey("b", noCharacters, caracterFactory);
		
		for(int i=0;i<noCharacters;i++)
			textCharacters[i].printCharacter(charactersLocations[i]);
		
		System.out.println("\n No of created objects: "+caracterFactory.getNoCharacters());

	}

}
