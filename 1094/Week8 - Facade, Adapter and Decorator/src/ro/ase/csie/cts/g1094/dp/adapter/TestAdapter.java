package ro.ase.csie.cts.g1094.dp.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		FantasyHero blueDragon = new FantasyHero("Blue dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
	}

}
