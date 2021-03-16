package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {
	
	private MarketingStrategyInterface mkStrategy = null ;
	private SalesValidatorsInterface validator = null;
	
	public SalesStrategy(MarketingStrategyInterface mkStrategy,
			SalesValidatorsInterface validator) {
		if(mkStrategy == null | validator == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
		this.validator = validator;
	}
	
	//optional - depends on your design specs
	//allowing the change at runtime of the marketing strategy
	public void setMarketingStrategy(MarketingStrategyInterface mkStrategy) {
		if(mkStrategy == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;	
	}
	
	
	public static float getPriceWithDiscount(
			float initialPrice, float discount, float fidelityDiscount) {
		
		float initialDiscount = initialPrice - (discount * initialPrice);
		return initialDiscount * (1- fidelityDiscount);
	}
	
	public float computeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidPriceException, InvalidYearsSinceRegistrationException
	  {
		
		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
		
	    float finalPrice = 0;
	    float fidelityDiscount = 
	    		(productType != ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration) : 0;
	    	    
	    finalPrice = getPriceWithDiscount(
	    		initialPrice,productType.getDiscount(), fidelityDiscount);
	       
	    return finalPrice;
	  }
}