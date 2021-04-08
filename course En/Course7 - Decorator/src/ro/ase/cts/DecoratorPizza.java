 package ro.ase.cts;

public abstract class DecoratorPizza extends AbstractPizza {

	protected final AbstractPizza pizza;
	
	public DecoratorPizza(AbstractPizza Pizza){
		this.pizza = Pizza;
	}
	
	@Override
	public String getIngrediente() {
		return pizza.getIngrediente();
	}

}
