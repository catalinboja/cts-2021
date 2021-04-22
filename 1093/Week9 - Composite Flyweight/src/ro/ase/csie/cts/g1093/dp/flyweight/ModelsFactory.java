package ro.ase.csie.cts.g1093.dp.flyweight;

import java.util.HashMap;

public class ModelsFactory {
	
	static HashMap<String, Model3DInterface> models = new HashMap<>();
	
	static {
		models.put(ModelType.BUILDING.toString(), new Model3DFlyweight("Building"));
		models.put(ModelType.SOLDIER.toString(), new Model3DFlyweight("Soldier"));
	}
	
	public static Model3DInterface getModel(ModelType type) {
		return models.get(type.toString());
	}
	
}
