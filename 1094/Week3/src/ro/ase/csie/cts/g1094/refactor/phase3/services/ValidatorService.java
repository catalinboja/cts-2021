package ro.ase.csie.cts.g1094.refactor.phase3.services;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorServiceInterface{

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if(price <= 0) {
			throw new InvalidPriceException();
		}
	}

	@Override
	public void validateAge(int accountAge) throws InvalidAgeException {
		if(accountAge < 0 ) {
			throw new InvalidAgeException();
		}
	}

}
