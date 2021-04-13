package ro.ase.csie.cts.g1094.dp.adapter;

public class FantasyHero extends ACMESuperHero {

	boolean canFly = false;
	
	public FantasyHero(String name, int lifePoints, boolean canFly) {
		super(name, lifePoints);
		this.canFly = canFly;
	}

	@Override
	public void move() {
		if(this.canFly) {
			System.out.println("Is flying");
		}
		else {
			System.out.println("Is running");
		}
	}

	@Override
	public void crouch() {
		System.out.println("Is crouching");
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(
				String.format("%s takes a hit of %d points", name, points));
		this.lifePoints -= points;
	}

	@Override
	public void heal(int points) {
		System.out.println(
				String.format("%s heals %d points", name, points));
		this.lifePoints += points;
	}

}
