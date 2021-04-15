package ro.ase.csie.cts.g1093.dp.adapter;

public class DonaldDuck implements DisneyActions {
	
	String name;
	int powerLevel;
	
	public DonaldDuck(String name, int powerLevel) {
		super();
		this.name = name;
		this.powerLevel = powerLevel;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPowerLevel() {
		return this.powerLevel;
	}

	@Override
	public void losePower(int power) {
		System.out.println(String.format("Losing %d power", power));
		this.powerLevel -= power;
	}

	@Override
	public void recoverPower(int power) {
		System.out.println(String.format("Recovering %d power", power));
		this.powerLevel += power;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Moving to new coordinates");
	}

}
