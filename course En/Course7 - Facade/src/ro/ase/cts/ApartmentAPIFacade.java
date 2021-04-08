package ro.ase.cts;

public class ApartmentAPIFacade {
	Window window;
	WaterFaucet faucet;
	EntryDoor door;
	WashingMachine washer;
	
	public ApartmentAPIFacade(Window window, 
	WaterFaucet faucet, 
	EntryDoor door, 
	WashingMachine washer){
		this.window = window;
		this.faucet = faucet;
		this.door = door;
		this.washer = washer;
	}
	
	public void lock(){
		this.window.close();
		this.faucet.close();
		this.washer.stop();
		this.door.close();
	}
	
	public void startWashingMachine(){
		this.faucet.open();
		this.washer.start();
	}
	
	

}
