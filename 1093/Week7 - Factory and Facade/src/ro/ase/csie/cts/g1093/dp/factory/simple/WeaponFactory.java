package ro.ase.csie.cts.g1093.dp.factory.simple;

public class WeaponFactory {
	public static AbstractWeapon getWeapon(WeaponType type, String color) {
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
