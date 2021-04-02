package ro.ase.acs.cts;

import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;
import ro.ase.acs.cts.module.InterfataSIMCard;

public class SmartDevice {
	
	//atribute
	String model;
	String producator;
	
	boolean areWiFi;
	
	//interfete pentru diferite module
	InterfataSIMCard SIM;
	InterfataGPS modulGPS;
	InterfataDisplay display;
	InterfataExternalMemory cardMemorie;
	
	//constructor default
	public SmartDevice(){
		
	}

	//constructor
	public SmartDevice(
			String model, 
			String producator, 
			boolean WiFiIntegrat,
			InterfataSIMCard sim,
			InterfataGPS modulGPS,
			InterfataDisplay display,
			InterfataExternalMemory cardMemorie){
	this.model = model;
	this.producator = producator;
	this.areWiFi = WiFiIntegrat;
	this.SIM = sim;
	this.modulGPS = modulGPS;
	this.display = display;
	this.cardMemorie = cardMemorie;
	}
	
	public SmartDevice(String model, 
			String producator){
		this.model = model;
		this.producator = producator;
	}

	
	//interfata publica pentru atribute

	public boolean hasWiFi() {
		return areWiFi;
	}
	
	public void areWiFi(){
		this.areWiFi = true;
	}

	/*
	 * public void hasWiFi(boolean areWiFi) { 
	 * this.areWiFi = areWiFi; 
	 * }
	 */
	public InterfataSIMCard getSIM() {
		return SIM;
	}

	public void setSIM(InterfataSIMCard sIM) {
		SIM = sIM;
	}

	public InterfataGPS getModulGPS() {
		return modulGPS;
	}

	public void setModulGPS(InterfataGPS modulGPS) {
		this.modulGPS = modulGPS;
	}

	public InterfataExternalMemory getCardMemorie() {
		return cardMemorie;
	}

	public void setCardMemorie(InterfataExternalMemory cardMemorie) {
		this.cardMemorie = cardMemorie;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getProducator() {
		return producator;
	}


	public void setProducator(String producator) {
		this.producator = producator;
	}


	public InterfataDisplay getDisplay() {
		return display;
	}


	public void setDisplay(InterfataDisplay display) {
		this.display = display;
	}

	
}
