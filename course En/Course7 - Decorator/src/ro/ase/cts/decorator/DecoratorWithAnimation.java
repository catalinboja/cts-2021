package ro.ase.cts.decorator;

public class DecoratorWithAnimation extends AbstractDecoratorForControls {

	public DecoratorWithAnimation(AbstractVisualControl controlVizual) {
		super(controlVizual);
	}

	
	@Override
	public void click() {
		this.visualControl.click();
		System.out.println("Some animation *******");
	};
}
