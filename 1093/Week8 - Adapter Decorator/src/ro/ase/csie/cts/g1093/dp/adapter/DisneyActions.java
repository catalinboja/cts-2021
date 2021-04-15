package ro.ase.csie.cts.g1093.dp.adapter;

public interface DisneyActions {
	
	public abstract String getName();
	public abstract int getPowerLevel();
	
	public abstract void losePower(int power);
	public abstract void recoverPower(int power);
	public abstract void changeLocation(int x, int y);
	
}
