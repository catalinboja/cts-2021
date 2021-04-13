package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;

public class Disney2SuperHeroAdapter extends SuperHeroCharacter{
	
	DisneyActions disneyCharacter = null;
	
	public Disney2SuperHeroAdapter(DisneyActions disneyCharacter) {
		
		super(disneyCharacter.getName(), disneyCharacter.getPower());
		this.disneyCharacter = disneyCharacter;

	}

	@Override
	public void move() {
		this.disneyCharacter.changeLocation(0, 0);
	}

	@Override
	public void crouch() {
		System.out.println(String.format("%s is crouching", disneyCharacter.getName()));
	}

	@Override
	public void takeAHit(int points) {
		this.disneyCharacter.isWounded(points);
	}

	@Override
	public void heal(int points) {
		this.disneyCharacter.isHealing(points);
	}

}
