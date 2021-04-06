package ro.ase.cts.decorator;

public class DecoratorButonCuSunetSpecial extends DecoratorAbstractControlVizual{

	String fisierSunet;
	
	public DecoratorButonCuSunetSpecial(AbstractControlVizual controlVizual, String fisier) {
		super(controlVizual);
		this.fisierSunet = fisier;
	}
	
	@Override
	public void click() {
		this.controlVizual.click();
		System.out.println("Click cu sunet din " + fisierSunet);
	};

}
