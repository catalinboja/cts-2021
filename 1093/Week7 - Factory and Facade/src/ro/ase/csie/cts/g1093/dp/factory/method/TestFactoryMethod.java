package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public class TestFactoryMethod {
	
	public static void main(String[] args) {
		
		boolean isWaterModeSet = true;
		
		if(isWaterModeSet) {
			//code the game using water based weapons
			AbstractWeapon pistol = new WaterPistol("Grey", 200);
			
		}
		else
		{
			//code the game using real weapons
			AbstractWeapon pistol = new Pistol("grey", 200, 100);
		}
		
		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();
		
		//generic game coding
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
		
		
	}
}
