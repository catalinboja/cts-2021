package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;

public class WaterBalloon extends AbstractWeapon{

	public WaterBalloon(String desc) {
		this.description = "A water balloon";
	}
	@Override
	public void pewPew() {
		System.out.println("Splash");
	}

}
