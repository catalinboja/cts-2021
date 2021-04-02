package ro.ase.cts.prototype;

import java.util.ArrayList;

public class SpaceShip extends Model3D{
	
	public SpaceShip(String tip){
		super();
		System.out.println("Loading 3D model for spaceship ....");
		try {
			System.out.println("Working ....");
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		points = new ArrayList<>(100);
		this.type = tip;
	}
	
	private SpaceShip() {
		System.out.println("Creating an empty spaceship object");
	}

	@Override
	void draw() {
		System.out.println("Spaceship with type "+this.type);
	}

	@Override
	public Object clone() {
		//avoid calling the constructor that requires time/processor time
		//SpaceShip copy = new SpaceShip("Federation");
		
		SpaceShip copy = new SpaceShip();
		copy.type = this.type;
		copy.points = (ArrayList<Object>) this.points.clone();
		
		return copy;
	}
	
	
	

}
