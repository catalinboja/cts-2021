package ro.ase.cts;


//Client context
public class CaracterContext {
	private final int textLocation;
	
	public CaracterContext(int location){
		this.textLocation = location;
	}
	
	public int getLocation(){
		return this.textLocation;
	}

}
