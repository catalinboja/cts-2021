package ro.ase.csie.cts.g1094.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		/*
		 * SuperHero superman = new SuperHero("Superman", new Pistol("Pistol", 100));
		 * superman.setWeapon(new MachineGun(500, 1000)); superman.setWeapon(new
		 * Bazooka());
		 */
	
	
	
	
	SuperHero batman = 
			new SuperHero("Batman", WeaponsFactory.getWeapon(WeaponType.PISTOL, "Pistol"));
	batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
	batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Boom"));
	
		
	}

}
