package ro.ase.acs.cts.builder3;

import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;

public class DispozitivMobilVer3 {
	
	//atribute
	String model;
	String producator;
	
	boolean areWiFi;
	
	//interfete pentru diferite module
	InterfataGPS modulGPS;
	InterfataDisplay display;
	InterfataExternalMemory cardMemorie;
	
	//constructor default privat
	private DispozitivMobilVer3(){
		
	}

	//interfata publica pentru atribute

	public boolean hasWiFi() {
		return areWiFi;
	}

	public InterfataGPS getModulGPS() {
		return modulGPS;
	}

	public InterfataExternalMemory getCardMemorie() {
		return cardMemorie;
	}

	public String getModel() {
		return model;
	}

	public String getProducator() {
		return producator;
	}

	public InterfataDisplay getDisplay() {
		return display;
	}


	//builder pentru clasa
	public static class DispozitivMobilBuilder{
			
		String model;
		String producator;		
		boolean areWiFi;
		InterfataGPS modulGPS;
		InterfataDisplay display;
		InterfataExternalMemory cardMemorie;
		
		public DispozitivMobilBuilder(String model, String producator){
			this.model = model;
			this.producator = producator;
		}
		
		//metoda pentru adaugare WiFi
		public DispozitivMobilBuilder adaugaWiFi(){
			this.areWiFi = true;
			return this;
		}
		
		//metoda pentru adaugare display
		public DispozitivMobilBuilder adaugaDisplay(InterfataDisplay display){
			this.display = display;
			return this;
		}
		
		//metoda pentru adaugare memorie
		public DispozitivMobilBuilder adaugaCardMemorie(InterfataExternalMemory memorie){
			this.cardMemorie = memorie;
			return this;
		}
		
		//metoda pentru adaugare GPS
		public DispozitivMobilBuilder adaugaModulGPS(InterfataGPS gps){
			this.modulGPS = gps;
			return this;
		}
		
		//metoda prin care se obtine obiectul creat
		public DispozitivMobilVer3 build(){
			DispozitivMobilVer3 dispozitiv = new DispozitivMobilVer3();
			dispozitiv.producator = producator;
			dispozitiv.model = model;
			dispozitiv.areWiFi = areWiFi;
			dispozitiv.cardMemorie = cardMemorie;
			dispozitiv.modulGPS = modulGPS;
			return dispozitiv;
			
		}
	}
}
