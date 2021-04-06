package ro.ase.csie.cts.g1094.dp.factorymethod;

import ro.ase.csie.cts.g1094.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponsFactory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		
		boolean kidsMode = true;
		SuperHero superman = null;
		
		if(kidsMode) {
			superman = new SuperHero("Superman", new WaterPistol());
		}
		else 
		{
			superman = new SuperHero("Superman", WeaponsFactory.getWeapon(WeaponType.PISTOL, ""));
		}
		
		//with factory method
		AbstractFactory weaponFactory = 
				(kidsMode == true) ? new WaterWeaponsFactory() : new RealWeaponsFactory();
		
		superman = new SuperHero("Superman", weaponFactory.getWeapon(WeaponType.PISTOL, ""));
		superman.setWeapon(weaponFactory.getWeapon(WeaponType.BAZOOKA, ""));
		
	}
}
