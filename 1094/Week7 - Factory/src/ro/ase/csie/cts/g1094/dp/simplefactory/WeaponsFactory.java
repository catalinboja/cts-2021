package ro.ase.csie.cts.g1094.dp.simplefactory;


public class WeaponsFactory {
	public static AbstractWeapon getWeapon(WeaponType type, String description) {

		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(description, 100);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(500, 1000);
			weapon.setDescription(description);
			break;
		case BAZOOKA:
			weapon = new Bazooka("test");
			weapon.setDescription(description);
			break;
		default:
			throw new UnsupportedOperationException("Type not covered");
		}
		
		return weapon;
	}
}
