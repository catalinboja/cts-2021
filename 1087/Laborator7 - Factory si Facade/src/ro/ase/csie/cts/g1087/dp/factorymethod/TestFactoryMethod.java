package ro.ase.csie.cts.g1087.dp.factorymethod;

import ro.ase.csie.cts.g1087.dp.simplefactory.FactorySuperErou;
import ro.ase.csie.cts.g1087.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.cts.g1087.dp.simplefactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		boolean esteTemaFantasy = true;
		
		FactoryAbstract factoryCaractere = null;
		
		if(esteTemaFantasy) {
			factoryCaractere = new FactoryTemaFantasy();
		}
		else
		{
			factoryCaractere = new FactoryTemaUniversala();
		}
		
		SuperErouAbstract superCaracter = 
				factoryCaractere.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = factoryCaractere.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman");
		
		
	}

}
