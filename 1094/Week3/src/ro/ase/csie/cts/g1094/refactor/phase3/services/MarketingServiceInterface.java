package ro.ase.csie.cts.g1094.refactor.phase3.services;

public interface MarketingServiceInterface {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFidelityDiscount(int accountAge);
}
