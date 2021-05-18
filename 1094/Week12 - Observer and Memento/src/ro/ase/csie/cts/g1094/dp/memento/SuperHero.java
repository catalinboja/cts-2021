package ro.ase.csie.cts.g1094.dp.memento;

public class SuperHero {
	
	String name;
	private int lifePoints;
	String magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking ...");
	}
	
	public void heal() {
		System.out.println("Is healing ...");
	}
	
	public void move() {
		System.out.println("Is moving...");
	}
	
	public SuperHeroMemento save() {
		return new SuperHeroMemento(name, lifePoints, magic);
	}
	
	public void load(SuperHeroMemento memento) {
		this.name = memento.getName();
		this.lifePoints = memento.getLifePoints();
		this.magic = memento.getMagic();
	}
	
}
