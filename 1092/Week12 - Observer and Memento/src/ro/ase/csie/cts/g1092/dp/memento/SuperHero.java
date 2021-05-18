package ro.ase.csie.cts.g1092.dp.memento;

public class SuperHero {
	String name;
	int lifePoints;
	private String magic;
	
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}

	public void attack() {
		System.out.println("Is attacking");
	}
	
	public void heal() {
		System.out.println("Is healing");
	}
	
	public void move() {
		System.out.println("Is moving");
	}
	
	public HeroRestorePoint saveData() {
		return new HeroRestorePoint(this.name, this.lifePoints, this.magic);
	}
	
	public void restoreData(HeroRestorePoint memento) {
		this.name = memento.name;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.getMagic();
	}
}
