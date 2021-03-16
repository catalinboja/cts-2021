package ro.ase.cts.g1092.refactor.phase5.services;

import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class Marketing2021Service implements MarketingStrategyInterface{

	@Override
	public float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
	}

}
