package ro.ase.cts;

//Command for Pizza

public class PizzaOrder implements KitchenOrder {

	private Cook cook;
	private String type;
	
	@Override
	public void prepare() {
		cook.preparaPizza(this.type);
	}
	
	public PizzaOrder(Cook cook, String type){
		this.cook = cook;
		this.type = type;
	}

}
