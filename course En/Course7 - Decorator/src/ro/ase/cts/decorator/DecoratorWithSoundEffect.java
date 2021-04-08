package ro.ase.cts.decorator;

public class DecoratorWithSoundEffect extends AbstractDecoratorForControls{

	String soundFile;
	
	public DecoratorWithSoundEffect(AbstractVisualControl visualControl, String file) {
		super(visualControl);
		this.soundFile = file;
	}
	
	@Override
	public void click() {
		//this.controlVizual.click();
		System.out.println("Play sound from file " + soundFile);
	};

}
