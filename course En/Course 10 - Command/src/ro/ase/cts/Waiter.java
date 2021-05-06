package ro.ase.cts;

import java.util.ArrayList;

//Invoker

public class Waiter {
	public ArrayList<KitchenOrder> tableOrders;
	int tableNo;
			
	public Waiter(int numarMasa){
		this.tableNo = numarMasa;
		tableOrders = new ArrayList<>();
	}
	
	public void takeOrder(KitchenOrder comanda){
		this.tableOrders.add(comanda);
	}
	
	public void sendOrder(){
		for(KitchenOrder order : tableOrders)
			order.prepare();
		this.tableOrders.clear();
	}
}
