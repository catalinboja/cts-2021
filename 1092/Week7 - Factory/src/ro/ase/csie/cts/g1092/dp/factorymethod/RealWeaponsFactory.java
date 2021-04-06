package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.Bazooka;
import ro.ase.csie.cts.g1092.dp.simplefactory.MachineGun;
import ro.ase.csie.cts.g1092.dp.simplefactory.Pistol;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class RealWeaponsFactory extends AbstractWeaponsFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(desc, 100);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(desc, 500);
		case BAZOOKA:
			weapon = new Bazooka(desc);
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}

}
