package ro.ase.csie.cts.g1092.dp.decorator;

public class ShieldDecorator extends AbstractDecorator {

	int shieldPower;

	public ShieldDecorator(SuperHeroCharacter decoratedObject, int shieldType) {
		super(decoratedObject);
		this.shieldPower = shieldType;
	}

	@Override
	public void takeAHit(int points) {
		int realPoints = points - shieldPower;
		if (realPoints < 0) {
			realPoints = 0;
		} else {
			this.decoratedObject.takeAHit(realPoints);
		}
	}

}
