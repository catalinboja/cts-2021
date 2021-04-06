package ro.ase.csie.cts.g1094.dp.simplefactory;

public class SuperHero {
	
	String name;
	AbstractWeapon weapon;
	
	
	public SuperHero(String name, AbstractWeapon weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}


	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
	
	
	
}
