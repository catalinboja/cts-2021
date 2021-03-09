package ro.ase.cts.g1092.refactor.phase3;

import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {
	
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	
	public static float getFidelityDiscount(int yearsSinceRegistration)
	{
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	}
	
	public static float getPriceWithDiscount(
			float initialPrice, float discount, float fidelityDiscount) {
		
		return (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
	}
	
	public float computeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueException();
		}		
		
	    float finalPrice = 0;
	    float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration);
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNTED:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.DISCOUNTED.getDiscount(), fidelityDiscount);
	    	break;
	    case LIMITED_STOCK:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.LIMITED_STOCK.getDiscount(), fidelityDiscount);
	    	break;
	    case LEGACY:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.LEGACY.getDiscount(), fidelityDiscount);
	    	break;
	    default:
	    	throw new UnsupportedOperationException("Type not managed");
	    }
	    
	    return finalPrice;
	  }
}