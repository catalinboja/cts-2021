package ro.ase.csie.cts.g1093.dp.strategy;

public class Player {

	String userName;
	int playTime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCampaign = null;
	
	
	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String userName, int playTime, int experiencePoints) {
		super();
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExperiencePoints(int pointsReceived) {
		if(this.bonusCampaign != null)
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
	}
}
