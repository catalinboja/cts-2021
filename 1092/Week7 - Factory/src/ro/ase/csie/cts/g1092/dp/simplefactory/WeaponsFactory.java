package ro.ase.csie.cts.g1092.dp.simplefactory;

public class WeaponsFactory {
	
	public static AbstractWeapon getWeapon(WeaponType type, String desc) {
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
