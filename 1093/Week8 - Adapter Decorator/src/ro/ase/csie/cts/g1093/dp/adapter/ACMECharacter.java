package ro.ase.csie.cts.g1093.dp.adapter;

public abstract class ACMECharacter {
	
	protected String name;
	protected int lifePoints;
	
	public ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public String getName() {
		return name;
	}

	public int getLifePoints() {
		return lifePoints;
	}
	
	public abstract void move();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
	
}
