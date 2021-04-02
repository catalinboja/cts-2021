package ro.ase.acs.cts;

import ro.ase.acs.cts.builder.DispozitivMobil;
import ro.ase.acs.cts.builder.DispozitivMobil.DispozitivMobilBuilder;
import ro.ase.acs.cts.builder2.ACMESmartDeviceBuilder;
import ro.ase.acs.cts.builder2.ConfiguratorDispozitiv;
import ro.ase.acs.cts.builder3.DispozitivMobilVer3;
import ro.ase.acs.cts.module.DisplaySuperAmoled;
import ro.ase.acs.cts.module.GPSIntern;
import ro.ase.acs.cts.module.SDCard;
import ro.ase.acs.cts.module.TelCoSIMCard;

public class TestBuilder {
	public static void main(String[] args){
		
		//creare & initializare obiect
		SmartDevice smartphone = new SmartDevice(
				"1",
				"2",
				true,
				new TelCoSIMCard(),
				new GPSIntern(),
				new DisplaySuperAmoled(5.1),
				new SDCard(64));
			
		//creare + initializare
		SmartDevice smartphone2 = new SmartDevice(
				"3310",
				"Nokia",
				true,
				null,
				null,
				null,
				null);
		
		
		//1. creare
		SmartDevice smartphone3 = new SmartDevice();
		//2. initializare atribute
		//TO DO: sa nu uit sa initializez toate atributele necesare
		smartphone3.areWiFi();
		//smartphone3.setProducator("Nokia");
		smartphone3.setModel("3310");
		
		
		//test builder v2
		ACMESmartDeviceBuilder builder = new ACMESmartDeviceBuilder("X");
		builder.adaugaWiFi();
		builder.adaugaGPS(new GPSIntern());
		SmartDevice smart1 = builder.getDispozitiv();
		
		//folosind catalogul
		ConfiguratorDispozitiv configurator = 
				new ConfiguratorDispozitiv(new ACMESmartDeviceBuilder("X"));
		configurator.construieste();
		SmartDevice smart2 = configurator.getDispozitiv();
		

	}

}
