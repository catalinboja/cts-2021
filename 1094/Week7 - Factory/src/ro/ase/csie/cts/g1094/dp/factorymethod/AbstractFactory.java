package ro.ase.csie.cts.g1094.dp.factorymethod;

import ro.ase.csie.cts.g1094.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponType;

public abstract class AbstractFactory {
	
	public abstract AbstractWeapon getWeapon(WeaponType type, String description);
	
}
