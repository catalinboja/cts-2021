package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;

public class ShieldDecorator extends AbstractDecorator{

	
	int shieldPoints;
	
	public ShieldDecorator(ACMESuperHero hero, int shieldLevel) {
		super(hero);
		this.shieldPoints = shieldLevel;
	}

	@Override
	public void takeAHit(int points) {
		int lostPoints = points - shieldPoints;
		if(lostPoints > 0)
			this.hero.takeAHit(lostPoints);
	}
	
	

}
