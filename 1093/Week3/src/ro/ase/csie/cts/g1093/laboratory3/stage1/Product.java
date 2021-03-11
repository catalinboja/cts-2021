package ro.ase.csie.cts.g1093.laboratory3.stage1;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class Product {
	
	public final static int MAX_ACCOUNT_AGE = 10;
	public final static float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {
		
		if(initialPrice <= 0) {
			throw new InvalidPriceException();
		}
		
		if(accountAgeInYears < 0) {
			throw new InvalidAccountAgeException();
		}
		
		
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float) accountAgeInYears / 100;
		
		float discountValue = 0;
		
		
		switch(productType) {
		case NEW:
			finalPrice = initialPrice;
			break;
		case DISCOUNT:
			discountValue = ProductType.DISCOUNT.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LIMITED_STOCK:
			discountValue = ProductType.LIMITED_STOCK.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LEGACY:
			discountValue = ProductType.LEGACY.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		default:
			throw new UnsupportedOperationException("New enum symbol not processed");	
		}
		
		
		return finalPrice;
	}
}