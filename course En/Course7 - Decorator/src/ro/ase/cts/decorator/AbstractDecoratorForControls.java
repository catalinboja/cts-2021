package ro.ase.cts.decorator;

public abstract class AbstractDecoratorForControls extends AbstractVisualControl{
	
	protected AbstractVisualControl visualControl;

	public AbstractDecoratorForControls(AbstractVisualControl visualControl) {
		super();
		this.visualControl = visualControl;
	}

	@Override
	public void click() {
		this.visualControl.click();
	};
	
	
}
