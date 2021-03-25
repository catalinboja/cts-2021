package ro.ase.acs.cts.initial;

import ro.ase.acs.cts.module.DisplaySuperAmoled;
import ro.ase.acs.cts.module.SDCard;
import ro.ase.acs.cts.module.TelCoSIMCard;

public class TestBuilder {

	public static void main(String[] args) {
		
		
		//this is not an atomic operation
		
		//1. create the empty object
		SmartDevice smartPhone = new SmartDevice();
		
		//2. init the object with values
		//TODO: don't forget to init the attributes
		smartPhone.setProducator("Apple");
		smartPhone.setCardMemorie(new SDCard(64));
		//init the others ones
		//what will happen if you forget to init one of the attributes ?
		
		
		//this is an atomic
		
		SmartDevice smartPhone2 = 
				new SmartDevice("S10", "Samsung", true, 
						new TelCoSIMCard(), null, new DisplaySuperAmoled(7), null);
		SmartDevice smartPhone3 = 
				new SmartDevice("", "", false, null, null, null, null);
		SmartDevice smartPhone4 = 
				new SmartDevice("Samsung", "S10", false, null, null, null, null);
		
	}

}
