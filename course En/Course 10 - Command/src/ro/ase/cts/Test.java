package ro.ase.cts;

public class Test {

	public static void main(String[] args) {

		// Receiver
		Cook cook = new Cook("Gigel");
		Cook soupChef = new Cook("Ionel");

		int tableNo = 6;
		// Invoker
		Waiter waiter = new Waiter(tableNo);

		waiter.takeOrder(
				new PizzaOrder(cook, "Country"));
		waiter.takeOrder(
				new PizzaOrder(cook, "Exotic"));
		waiter.takeOrder(
				new SoupOrder(soupChef, "Vegetables soup"));

		System.out.println("Waiting");
		waiter.sendOrder();
	}
}
