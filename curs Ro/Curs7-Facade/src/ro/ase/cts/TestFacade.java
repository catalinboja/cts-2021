package ro.ase.cts;

public class TestFacade {

	public static void main(String[] args) {
		
		
		Fereastra feareastraBucatarie = new Fereastra();
		RobinetApa robinetApaBucatarie = new RobinetApa();
		UsaLocuinta usaLocuinta = new UsaLocuinta();
		MasinaSpalat masinaSpalat = new MasinaSpalat();
		
		//inchide locuinta
		feareastraBucatarie.inchide();
		robinetApaBucatarie.inchide();
		usaLocuinta.inchide();
		masinaSpalat.opreste();
		
		//porneste masina de spalat
		robinetApaBucatarie.deschide();
		masinaSpalat.porneste();
		
			
		
		ApartamentFacade apartament = new ApartamentFacade(new Fereastra(), new RobinetApa(), new UsaLocuinta(), new MasinaSpalat());
		apartament.inchideCasa();
		//mai tarziu ...
		apartament.pornesteMasinaSpalat();
		

	}

}
