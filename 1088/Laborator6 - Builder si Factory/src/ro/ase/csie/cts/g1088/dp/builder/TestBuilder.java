package ro.ase.csie.cts.g1088.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. Creare
		//SuperErou superErou = new SuperErou();
		//2. Initializare
		//...
		//superErou.nume = "Superman";
		
		//SuperErou superErou2 = 
		//		new SuperErou(
		//				"Superman", 100, false, false, 
		//				new Arma(), null, new Laser(), null);
		
		SuperErou superman = new SuperErou.SuperErouBuilder("Superman", 100).build();
		SuperErou joker = new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		
		
		
	}

}
