package ro.ase.csie.cts.g1094.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1094.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1094.dp.adapter.disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args) {
		
		ACMESuperHero blueDragon = new FantasyHero("Blue dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
		
		DisneyActions donald = new DonaldDuck(100);
		donald.changeLocation(100, 150);
		donald.isWounded(50);
		donald.restorePower(25);
		
		ArrayList<ACMESuperHero> heroes = new ArrayList<>();
		heroes.add(blueDragon);
		Disney2AcmeAdapter donaldAdapter = new Disney2AcmeAdapter(donald);
		heroes.add(donaldAdapter);
		
		System.out.println("-----------------");
		
		for(ACMESuperHero hero : heroes) {
			hero.move();
			hero.takeAHit(50);
			hero.heal(40);
		}
		
	}

}
