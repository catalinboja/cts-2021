package ro.ase.csie.cts.g1092.dp.simplefactory;

public class SuperHero {
	
	String name;
	AbstractWeapon weapon;
	
	public SuperHero(String name) {
		super();
		this.name = name;
	}
	
	public AbstractWeapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
	
	
	
}
