package ro.ase.acs.cts.builder.versiune1;

import ro.ase.acs.cts.initial.SmartDevice;
import ro.ase.acs.cts.module.SDCard;

public class TestBuilderv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ACMESmartDeviceBuilder builder = 
				new ACMESmartDeviceBuilder("S10","Samsung");
		//configure the device
		builder.adaugaWiFi();
		builder.adaugaSDCard(new SDCard(64));
		
		SmartDevice smartDevice = builder.getDispozitiv();
		
		
		
	}

}
