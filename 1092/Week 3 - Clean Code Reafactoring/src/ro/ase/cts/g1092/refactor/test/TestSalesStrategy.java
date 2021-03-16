package ro.ase.cts.g1092.refactor.test;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.ProductType;
import ro.ase.cts.g1092.refactor.phase5.SalesStrategy;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;
import ro.ase.cts.g1092.refactor.phase5.services.Marketing2021Service;
import ro.ase.cts.g1092.refactor.phase5.services.ValidatorService;

public class TestSalesStrategy {

	public static void main(String[] args) {
		
		
		Marketing2021Service mkService = new Marketing2021Service();
		ValidatorService validator = new ValidatorService();
		SalesStrategy sales = new SalesStrategy(mkService, validator);
		
		try {
			
			float finalPrice = 
					sales.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
			sales.setMarketingStrategy(new MarketingStrategyInterface() {
				@Override
				public float getFidelityDiscount(int yearsSinceRegistration) {
					return 0.5f;
				}
			});
			
			finalPrice = 
					sales.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		} catch (InvalidYearsSinceRegistrationException e) {
			e.printStackTrace();
		}
	}

}
