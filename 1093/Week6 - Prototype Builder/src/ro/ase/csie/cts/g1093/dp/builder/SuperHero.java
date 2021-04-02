package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {
	
	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	private WeaponInterface rightWeapon;
	private WeaponInterface leftWeapon;
	
	private SuperPowerInterface superPower;
	private SuperPowerInterface superSuperPower;
	
	private SuperHero() {
		
	}

	private SuperHero(
			String name, 
			int lifePoints, 
			boolean isVillain, 
			boolean isWounded, 
			WeaponInterface rightWeapon,
			WeaponInterface leftWeapon, 
			SuperPowerInterface superPower, 
			SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperHeroBuilder {
		SuperHero superHero;
		
		public SuperHeroBuilder(String name, int lifePoints) {
			this.superHero = new SuperHero();
			this.superHero.name = name;
			this.superHero.lifePoints = lifePoints;
		}
		
		public SuperHeroBuilder isVillain() {
			this.superHero.isVillain = true;
			return this;
		}
		
		public SuperHeroBuilder isWounded() {
			this.superHero.isWounded = true;
			return this;
		}
		
		public SuperHeroBuilder setRightWeapon(WeaponInterface weapon) {
			this.superHero.rightWeapon = weapon;
			return this;
		}
		
		public SuperHeroBuilder setLeftWeapon(WeaponInterface weapon) {
			this.superHero.leftWeapon = weapon;
			return this;
		}
		
		public SuperHeroBuilder setSuperPower(SuperPowerInterface power) {
			this.superHero.superPower = power;
			return this;
		}
		
		public SuperHeroBuilder setSuperSuperPower(SuperPowerInterface power) {
			this.superHero.superSuperPower = power;
			return this;
		}

		public SuperHero build() {
			return this.superHero;
		}
	}
	
	
	
}
