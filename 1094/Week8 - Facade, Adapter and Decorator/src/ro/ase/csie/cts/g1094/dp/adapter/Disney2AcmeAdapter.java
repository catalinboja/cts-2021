package ro.ase.csie.cts.g1094.dp.adapter;

import ro.ase.csie.cts.g1094.dp.adapter.disney.DisneyActions;

public class Disney2AcmeAdapter extends ACMESuperHero{
	
	DisneyActions disneyHero = null;

	public Disney2AcmeAdapter(DisneyActions disneyHero) {
		super(disneyHero.getName(), disneyHero.getPower());
		this.disneyHero = disneyHero;
	}

	@Override
	public void move() {
		this.disneyHero.changeLocation(0, 0);
	}

	@Override
	public void crouch() {
		System.out.println(
				String.format("%s is moving slowly", this.disneyHero.getName()));
	}

	@Override
	public void takeAHit(int points) {
		this.disneyHero.isWounded(points);
	}

	@Override
	public void heal(int points) {
		this.disneyHero.restorePower(points);
	}
	
	
	
}
