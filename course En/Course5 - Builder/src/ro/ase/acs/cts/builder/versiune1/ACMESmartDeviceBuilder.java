package ro.ase.acs.cts.builder.versiune1;

import ro.ase.acs.cts.initial.SmartDevice;
import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;
import ro.ase.acs.cts.module.InterfataSIMCard;

public class ACMESmartDeviceBuilder extends AbstractSmartDeviceBuilder{
	
	//atribute
	String model;
	String producator;
	
	boolean areWiFi;
	
	//interfete pentru diferite module
	InterfataSIMCard SIM;
	InterfataGPS modulGPS;
	InterfataDisplay display;
	InterfataExternalMemory cardMemorie;
	
	//constructor ce solicita atributele obligatorii
	public ACMESmartDeviceBuilder(String model, String manufacturer){
		
		this.model = model;
		this.producator = manufacturer;

	}
	
	//metode din interfata abstracta

	@Override
	public void adaugaWiFi() {
		// TODO adaugare reguli proprii de validare a modulului
		this.areWiFi = true;
	}

	@Override
	public void adaugaGPS(InterfataGPS modulGPS) {
		// TODO adaugare reguli proprii de validare a modulului
		this.modulGPS = modulGPS;
	}

	@Override
	public void adaugaDisplay(InterfataDisplay display) {
		// TODO adaugare reguli proprii de validare a modulului
		this.display = display;
		
	}

	@Override
	public void adaugaSDCard(InterfataExternalMemory memorieExterna) {
		// TODO adaugare reguli proprii de validare a modulului
		this.cardMemorie = memorieExterna;
		
	}
	
	//metoda publica pentru a obtine dispozitivul
	public SmartDevice getDispozitiv(){
		return new SmartDevice(
				this.model, producator, 
				this.areWiFi, 
				this.SIM, 
				modulGPS, 
				display, 
				cardMemorie);
	}

}
