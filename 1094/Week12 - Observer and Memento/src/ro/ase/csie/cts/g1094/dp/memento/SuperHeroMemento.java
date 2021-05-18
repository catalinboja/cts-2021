package ro.ase.csie.cts.g1094.dp.memento;

import java.util.Date;

public class SuperHeroMemento {
	String name;
	private int lifePoints;
	String magic;
	
	Date timestamp;
	
	
	public SuperHeroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	}
	
	public String getName() {
		return name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public String getMagic() {
		return magic;
	}
	
	
}
