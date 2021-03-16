package ro.ase.cts.g1092.refactor.phase5.marketing;

public interface MarketingStrategyInterface {
	
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFidelityDiscount(int yearsSinceRegistration);
}
