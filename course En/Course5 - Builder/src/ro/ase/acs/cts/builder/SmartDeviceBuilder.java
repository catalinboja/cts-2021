package ro.ase.acs.cts.builder;

import ro.ase.acs.cts.initial.SmartDevice;
import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;
import ro.ase.acs.cts.module.InterfataSIMCard;

public class SmartDeviceBuilder {
	
	String model;
	String manufacturer;
	
	boolean hasWiFi;
	
	InterfataSIMCard SIM;
	InterfataGPS GPSModule;
	InterfataDisplay display;
	InterfataExternalMemory memoryCard;
	
	//reference to the object that will be created by the builder
	private SmartDevice smartDevice = null;
	
	public SmartDeviceBuilder(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	
	public void hasWiFi(boolean areWiFi) {
		this.hasWiFi = areWiFi;
	}
	
	public void setSIM(InterfataSIMCard sIM) {
		SIM = sIM;
	}
	
	public void setModulGPS(InterfataGPS modulGPS) {
		this.GPSModule = modulGPS;
	}
	
	public void setCardMemorie(InterfataExternalMemory cardMemorie) {
		this.memoryCard = cardMemorie;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setProducator(String producator) {
		this.manufacturer = producator;
	}
	
	public void setDisplay(InterfataDisplay display) {
		this.display = display;
	}
	
	//method used to return the built object
	public SmartDevice getSmartDevice() {
		return new SmartDevice(
				model,manufacturer,hasWiFi,SIM, GPSModule, display, memoryCard);
	}

}
