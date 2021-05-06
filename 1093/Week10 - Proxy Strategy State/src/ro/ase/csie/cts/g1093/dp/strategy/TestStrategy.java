package ro.ase.csie.cts.g1093.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Player player = new Player("John", 10, 100);
		
		player.setBonusCampaign(new NoCampaign());
		player.getExperiencePoints(150);
		
		System.out.println("Points: " + player.experiencePoints);
		
		player.setBonusCampaign(new EasterCampaign());
		player.getExperiencePoints(150);
		
		System.out.println("Points: " + player.experiencePoints);
		
		player.setBonusCampaign(new SummerCampaign());
		player.getExperiencePoints(150);
		
		System.out.println("Points: " + player.experiencePoints);
		
	}

}
