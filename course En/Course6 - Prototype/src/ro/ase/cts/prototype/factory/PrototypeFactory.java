package ro.ase.cts.prototype.factory;

import java.util.HashMap;

import ro.ase.cts.prototype.Asteroid;
import ro.ase.cts.prototype.Model3D;
import ro.ase.cts.prototype.SpaceShip;

public class PrototypeFactory {
	
	private static HashMap<String,Model3D> prototypes = new HashMap<>();
	
	static {
		//load prototypes
		
		System.out.println("Init prototypes models...");
		
		SpaceShip spaceshipModel = new SpaceShip("Spaceship type 1");
		spaceshipModel.setId("type1");
		
		prototypes.put("spaceship", spaceshipModel);
		
		Asteroid modelAsteroid = new Asteroid();
		modelAsteroid.setId("asteroid");
		
		prototypes.put("asteroid", modelAsteroid);
	}
	
	//factory prototype method
	public static Model3D getPrototype(String id){
		Model3D prototypeCopy = null;
		Model3D prototype = prototypes.get(id);
		if(prototype!=null)
			prototypeCopy = (Model3D) prototype.clone();
		
		return prototypeCopy;
		
	}

}
