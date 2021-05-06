package ro.ase.csie.cts.g1093.dp.state;

public class TestState {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("Superman", 500);
		superman.move();
		
		superman.takeAHit(350);
		superman.move();
		
		superman.takeAHit(110);
		superman.move();
		
		superman.heal(500);
		superman.move();
	}

}
