package ro.ase.acs.cts.initial;

import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;
import ro.ase.acs.cts.module.InterfataSIMCard;

public class SmartDevice {
	
	String model;
	String manufacturer;
	
	boolean hasWiFi;
	
	InterfataSIMCard SIM;
	InterfataGPS GPSModule;
	InterfataDisplay display;
	InterfataExternalMemory memoryCard;
	
	public SmartDevice(){
		
	}
	
	public SmartDevice(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public SmartDevice(
			String model, 
			String producator, 
			boolean WiFiIntegrat,
			InterfataSIMCard sim,
			InterfataGPS modulGPS,
			InterfataDisplay display,
			InterfataExternalMemory cardMemorie){
	this.model = model;
	this.manufacturer = producator;
	this.hasWiFi = WiFiIntegrat;
	this.SIM = sim;
	this.GPSModule = modulGPS;
	this.display = display;
	this.memoryCard = cardMemorie;
	}
	

	public boolean hasWiFi() {
		return hasWiFi;
	}

	public void hasWiFi(boolean areWiFi) {
		this.hasWiFi = areWiFi;
	}

	public InterfataSIMCard getSIM() {
		return SIM;
	}

	public void setSIM(InterfataSIMCard sIM) {
		SIM = sIM;
	}

	public InterfataGPS getModulGPS() {
		return GPSModule;
	}

	public void setModulGPS(InterfataGPS modulGPS) {
		this.GPSModule = modulGPS;
	}

	public InterfataExternalMemory getCardMemorie() {
		return memoryCard;
	}

	public void setCardMemorie(InterfataExternalMemory cardMemorie) {
		this.memoryCard = cardMemorie;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getProducator() {
		return manufacturer;
	}


	public void setProducator(String producator) {
		this.manufacturer = producator;
	}


	public InterfataDisplay getDisplay() {
		return display;
	}


	public void setDisplay(InterfataDisplay display) {
		this.display = display;
	}

	
}
