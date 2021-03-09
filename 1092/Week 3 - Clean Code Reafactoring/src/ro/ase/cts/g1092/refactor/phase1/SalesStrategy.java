package ro.ase.cts.g1092.refactor.phase1;

public class SalesStrategy {
	public float ComputeFinalPrice(
			int productType, float initialPrice, int yearsSinceRegistration)
	  {
	    float finalResult = 0;
	    float fidelityDiscount = (yearsSinceRegistration > 10) ? (float)15/100 : (float)yearsSinceRegistration/100; 
	    if (productType == 1)
	    {
	      finalResult = initialPrice;
	    }
	    else if (productType == 2)
	    {
	      finalResult = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	      finalResult = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	      finalResult = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalResult;
	  }
}