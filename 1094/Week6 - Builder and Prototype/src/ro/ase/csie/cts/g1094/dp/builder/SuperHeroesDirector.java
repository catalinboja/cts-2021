package ro.ase.csie.cts.g1094.dp.builder;

public class SuperHeroesDirector {
	
	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder = builder;
	}
	
	public SuperHero buildJoker() {
		return builder.isVillain()
				.addLeftWeapon(new Pistol())
				.addRighttWeapon(new Pistol())
				.build();
	}
	
	public SuperHero buildSuperman() {
		return 	builder.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	}
	
}
