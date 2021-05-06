package ro.ase.cts;

//Command concret pentru Pizza

public class SoupOrder implements KitchenOrder{

	private Cook cook;
	private String type;
	
	@Override
	public void prepare() {
		this.cook.prepareSoup(this.type);
	}
	
	public SoupOrder(Cook cook, String type){
		this.cook = cook;
		this.type = type;
	}
	
}
