package ro.ase.cts;

public class TestPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaSimpla pizzaSimpla = new PizzaSimpla("Simpla", 10);
		DecoratorPizzaTaraneasca pizzaTaraneasca = new DecoratorPizzaTaraneasca(pizzaSimpla);
		DecoratorPizzaExotica pizzaExotica = new DecoratorPizzaExotica(pizzaSimpla);
		
		System.out.println(pizzaSimpla.getIngrediente());
		System.out.println(pizzaTaraneasca.getIngrediente());
		System.out.println(pizzaExotica.getIngrediente());

		System.out.println(pizzaSimpla.getIngrediente());
		//decorate ther simple pizza by ading ham
		
		DecoratorPizza simpleWithHam= 
				new DecoratorPizza(pizzaSimpla) {
			
					@Override
					public String getIngrediente(){
						return this.pizza.getIngrediente() + " with Ham";
					}
				};
		System.out.println(simpleWithHam.getIngrediente());
	}

}
