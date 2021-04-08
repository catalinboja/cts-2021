package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {
	
	public abstract AbstractWeapon getWeapon(WeaponType type, String color);
	
}
