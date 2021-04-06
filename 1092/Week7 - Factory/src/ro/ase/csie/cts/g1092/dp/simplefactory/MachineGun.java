package ro.ase.csie.cts.g1092.dp.simplefactory;

public class MachineGun extends AbstractWeapon {
	
	int noBullets;
	
	public MachineGun(String desc, int power) {
		this.description = desc;
		this.powerLevel = power;
		//this.noBullets = ammo;
	}

	@Override
	public void pewPew() {
		System.out.println("Tac Tac Tac ------------>");
	}
	
}
