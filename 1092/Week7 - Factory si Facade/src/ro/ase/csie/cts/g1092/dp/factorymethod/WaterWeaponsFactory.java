package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponsFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon = null;
		switch(type) {
		case BAZOOKA:
			weapon = new WaterBalloon("Water balloon");
			break;
		default:
			throw new UnsupportedOperationException("No implemented");
		}
		return weapon;
	}

}
