package ro.ase.acs.cts.builder.versiune2;

import ro.ase.acs.cts.initial.SmartDevice;
import ro.ase.acs.cts.module.InterfataDisplay;
import ro.ase.acs.cts.module.InterfataExternalMemory;
import ro.ase.acs.cts.module.InterfataGPS;

public class ACMESmartDeviceBuilder extends AbstractSmartDeviceBuilder{
	
	//referinta catre un smart device
	SmartDevice dispozitiv;
	
	//constructor ce solicita atributele obligatorii
	public ACMESmartDeviceBuilder(String model){
		dispozitiv = new SmartDevice();
		
		//producator setat implicit
		dispozitiv.setProducator("ACME");
		dispozitiv.setModel(model);
	}
	
	//metode din interfata abstracta

	@Override
	public void adaugaWiFi(boolean existaWiFi) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.hasWiFi(existaWiFi);
	}

	@Override
	public void adaugaGPS(InterfataGPS modulGPS) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setModulGPS(modulGPS);
	}

	@Override
	public void adaugaDisplay(InterfataDisplay display) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setDisplay(display);
		
	}

	@Override
	public void adaugaSDCard(InterfataExternalMemory memorieExterna) {
		// TODO adaugare reguli proprii de validare a modulului
		dispozitiv.setCardMemorie(memorieExterna);
		
	}
	
	//metoda publica pentru a obtine dispozitivul
	public SmartDevice getDispozitiv(){
		return this.dispozitiv;
	}

}
