package ro.ase.csie.cts.g1088.laborator3.faza2;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}
	
	public static void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if(vechimeClientInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}
	
	public static float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) 
			throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		
		validarePret(pretInitial);
		validareVechimeClient(vechimeClientInAni);
		
	    float pretFinal = 0;
	    float discountFidelitate = getDiscountFidelitate(vechimeClientInAni);
	    float discount = TipProdus.NOU.getDiscount();
	    float valoareDiscountTipProdus = 0;
	    
	    switch(tipProdus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    case DISCOUNT:
	    	discount = TipProdus.DISCOUNT.getDiscount();
	    	valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
	    	pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);
	    	break;
	    case STOC_LIMITAT:
	    	discount = TipProdus.STOC_LIMITAT.getDiscount();
	    	valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
	    	pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);
	    	break;
	    case VECHI:
	    	discount = TipProdus.VECHI.getDiscount();
	    	valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
	    	pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);
	    	break;
	    default:
	    	throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat");	
	    }
	    
	    return pretFinal;
	  }
}