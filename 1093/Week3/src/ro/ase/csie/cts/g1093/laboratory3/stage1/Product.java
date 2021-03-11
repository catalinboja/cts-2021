package ro.ase.csie.cts.g1093.laboratory3.stage1;

public class Product {
	
	public final static int MAX_ACCOUNT_AGE = 10;
	public final static float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	
	public float getFinalPrice(int productType, float initialPrice, int accountAgeInYears) {
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float) accountAgeInYears / 100;
		
		if (productType == 1) {
			finalPrice = initialPrice;
		} else if (productType == 2) {
			finalPrice = (initialPrice - (0.1f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		} else if (productType == 3) {
			finalPrice = (initialPrice - (0.25f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.25f * initialPrice));
		} else if (productType == 4) {
			finalPrice = (initialPrice - (0.35f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.35f * initialPrice));
		}
		
		return finalPrice;
	}
}