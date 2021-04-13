package ro.ase.cts;

public class TestFlyweight {
	
	
	private static Caracter[] caractereText = new Caracter[100];
	private static CaracterContext[] pozitiiCaractere = new CaracterContext[100];
	private static int nrCaractere = 0;
	
	public static void apasaTasta(String caracter, int pozitie, CaracterFactory caracterFactory){
		caractereText[nrCaractere] = caracterFactory.getCaracter(caracter);
		pozitiiCaractere[nrCaractere] = new CaracterContext(pozitie);
		nrCaractere++;
	}
	

	public static void main(String[] args) {

		CaracterFactory caracterFactory  = new CaracterFactory();
		apasaTasta("a", nrCaractere, caracterFactory);
		apasaTasta("a", nrCaractere, caracterFactory);
		apasaTasta("a", nrCaractere, caracterFactory);
		apasaTasta("a", nrCaractere, caracterFactory);
		apasaTasta("b", nrCaractere, caracterFactory);
		apasaTasta("b", nrCaractere, caracterFactory);
		apasaTasta("b", nrCaractere, caracterFactory);
		
		for(int i=0;i<nrCaractere;i++)
			caractereText[i].printeazaCaracter(pozitiiCaractere[i]);
		
		System.out.println("\n Nr obiecte create:"+caracterFactory.getNrCaractere());

	}

}
