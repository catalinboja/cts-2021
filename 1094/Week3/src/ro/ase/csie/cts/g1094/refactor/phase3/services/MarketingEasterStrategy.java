package ro.ase.csie.cts.g1094.refactor.phase3.services;

public class MarketingEasterStrategy implements MarketingServiceInterface {

	@Override
	public float getFidelityDiscount(int accountAge) {
		return 0.5f;
	}

}
