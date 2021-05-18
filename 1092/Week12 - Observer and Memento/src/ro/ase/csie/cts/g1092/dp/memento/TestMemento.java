package ro.ase.csie.cts.g1092.dp.memento;

public class TestMemento {
	
	public static void main(String[] args) {
		
		SuperHero hero = new SuperHero("Superman", 500, "Fly");
		
		HeroRestorePoint initial = hero.saveData();
		
		hero.lifePoints += 500;
		
		System.out.println("Lifepoints: " + hero.lifePoints);
		
		hero.restoreData(initial);
		
		System.out.println("Lifepoints: " + hero.lifePoints);
		
		
	}
}
