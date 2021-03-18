package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

public interface MarketingInterface {

	public final static int MAX_ACCOUNT_AGE = 10;
	public final static float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFidelityDiscount(int accountAgeInYears);
}
