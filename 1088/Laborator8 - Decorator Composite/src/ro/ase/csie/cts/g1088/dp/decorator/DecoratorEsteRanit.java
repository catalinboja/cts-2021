package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract {
	
	public static final int NIVEL_CRITIC = 200;

	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
	}

	@Override
	public void alearga() {
		if(this.erou.getPuncteViata() < NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga. Este ranit critic");
		}
		else
			this.erou.alearga();
	}
	
	

}
