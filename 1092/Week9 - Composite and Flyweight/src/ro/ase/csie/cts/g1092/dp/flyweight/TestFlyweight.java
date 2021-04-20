package ro.ase.csie.cts.g1092.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {
		
		List<NPCCoordinates> soldiers = new ArrayList<>();
		soldiers.add(new NPCCoordinates(10, 10, 10, "Red"));
		soldiers.add(new NPCCoordinates(50, 10, 10, "Green"));
		soldiers.add(new NPCCoordinates(100, 100, 10, "Yellow"));
		
		Model3DFlyweightInterface soldierModel = 
				Model3DFactory.getModel(ModelType.SOLDIER);
		for(NPCCoordinates soldierCoord : soldiers) {
			soldierModel.display(soldierCoord);
		}
		
	}

}
