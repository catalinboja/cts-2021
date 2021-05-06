package ro.ase.cts;

//Receiver

public class Cook {
	
	private String nume;
	
	public Cook(String nume){
		this.nume = nume;
	}
	
	public void preparaPizza(String tipPizza){
		System.out.println("A fost preparata o pizza de tip "+tipPizza);
	}
	
	public void prepareSoup(String soupType){
		System.out.println("A fost facuta o supa de tip "+soupType);
	}
}
