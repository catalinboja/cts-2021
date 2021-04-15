package ro.ase.cts;


//Concrete Flyweight
public class Character implements PrintableCharacter{

	private final String character;
	
	public Character(String value){
		this.character = value;
	}
	
	public String getCharacter(){
		return this.character;
	}
	@Override
	public void printCharacter(CaracterContext context) {
		System.out.println(this.character+ " is on location "+context.getPozitie());
		
	}

}
