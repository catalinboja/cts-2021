package ro.ase.csie.cts.g1093.dp.strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += points;
	}

}
