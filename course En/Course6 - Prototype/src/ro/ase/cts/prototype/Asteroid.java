package ro.ase.cts.prototype;

import java.util.ArrayList;

public class Asteroid extends Model3D{

	public Asteroid(){
		super();
		System.out.println("Loading 3D model for the asteroid ....");
		points = new ArrayList<>(50);
		this.type = "Asteroid";
	}
	
	@Override
	void draw() {
		System.out.println("3D Model for "+this.type);
	}

}
