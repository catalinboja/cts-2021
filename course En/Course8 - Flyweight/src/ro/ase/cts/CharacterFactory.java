package ro.ase.cts;

import java.util.HashMap;
import java.util.Map;


//Flyweight factory
public class CharacterFactory {
	private Map<String, Character> characters = new HashMap<String, Character>();
	
	static {
		//create all the Flyweights
		//another solution
	}
	
	public Character getCaracter(String characterValue){
		Character character = characters.get(characterValue);
		if (character == null){
			character = new Character(characterValue);
			characters.put(characterValue, character);
		}
		return character;		
	}
	
	public int getNoCharacters(){
		return characters.size();
	}
}
