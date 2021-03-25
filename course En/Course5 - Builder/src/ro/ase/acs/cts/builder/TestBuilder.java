package ro.ase.acs.cts.builder;

import ro.ase.acs.cts.module.SDCard;

public class TestBuilder {
	public static void main(String[] args) {
		
		DispozitivMobil smartPhone = 
				new DispozitivMobil.DispozitivMobilBuilder("S10", "Samsung")
				.adaugaWiFi()
				.adaugaCardMemorie(new SDCard(64))
				.build();
	}
}
