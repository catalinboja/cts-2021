package ro.ase.csie.cts.g1094.dp.simplefactory;

public abstract class AbstractWeapon {
	
	protected String description;
	protected int powerLevel;
	

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract void pewPew();
	
}
