package ro.ase.csie.cts.g1087.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		/*
		 * SuperErouAbstract supererou = new CaracterDisney("Mickey Mouse", 100, false);
		 * supererou = new CaracterMarvel("Spiderman", 150, 50); supererou = new
		 * CaracterDCComics("Batman", 150);
		 */
		
		boolean selectieTemaUniversala = true;
		
		SuperErouAbstract superCaracter = null;
		
		if(selectieTemaUniversala) {
		
		superCaracter = 
				FactorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
		
		superCaracter.setPuncteViata(100);
		} else
		{
			//folosesti caractere din tema orginala a jocului
		}
				
		
	}

}
