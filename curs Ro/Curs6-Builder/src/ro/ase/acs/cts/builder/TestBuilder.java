package ro.ase.acs.cts.builder;

import ro.ase.acs.cts.module.SDCard;

public class TestBuilder {

	public static void main(String[] args) {
		
		DispozitivMobil smartphone = 
				new DispozitivMobil.DispozitivMobilBuilder("3310", "Nokia")
				.adaugaWiFi()
				.adaugaCardMemorie(new SDCard(64))
				.build();
		
	}

}
