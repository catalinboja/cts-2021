package ro.ase.csie.cts.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ScreenData soldier1 = new ScreenData(100,100,0, "Green");
		ScreenData soldier2 = new ScreenData(100,50,0, "Blue");
		
		ScreenData building1 = new ScreenData(10, 10, 5, "Grey");
		ScreenData building2 = new ScreenData(20, 50, 5, "Dark Grey");
		
		Model3DInterface soldierModel = ModelsFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier1);
		soldierModel.display(soldier2);
		
		ModelsFactory.getModel(ModelType.BUILDING).display(building1);
		ModelsFactory.getModel(ModelType.BUILDING).display(building2);
		 
		
	}

}
