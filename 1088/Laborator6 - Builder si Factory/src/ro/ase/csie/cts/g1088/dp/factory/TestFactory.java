package ro.ase.csie.cts.g1088.dp.factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {
		
		//CaracterAbstract mickeyMouse = new CaracterDisney("rosu", "Mickey Mouse");
		//CaracterAbstract spiderMan = new CaracterMarvel("Spiderman", 100);
		
		CaracterAbstract mickeyMouse = 
				FactoryCaractere.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");
		
		ArrayList<CaracterAbstract> caractere = new ArrayList<>();
		
	}

}
