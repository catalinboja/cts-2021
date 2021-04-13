package ro.ase.csie.cts.g1094.dp.decorator;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(ACMESuperHero hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.hero.lifePoints > 500)
			this.hero.move();
		else {
			System.out.println("The hero is barely moving");
		}
	}
	
	

}
