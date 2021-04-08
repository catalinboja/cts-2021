package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.Bazooka;
import ro.ase.csie.cts.g1093.dp.factory.simple.MachineGun;
import ro.ase.csie.cts.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public class RealModeFactory extends AbstractWeaponFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(color, 100, 50);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(color);
			break;
		case BAZOOKA:
			weapon = new Bazooka(color, 1000, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}

}
