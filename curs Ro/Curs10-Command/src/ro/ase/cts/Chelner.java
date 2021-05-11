package ro.ase.cts;

import java.util.ArrayList;

//Invoker - cel care gestioneaza si trimite comenzile de la o masa

public class Chelner {
	public ArrayList<ComandaBucatarie> comenziMasa;
	int numarMasa;
			
	public Chelner(int numarMasa){
		this.numarMasa = numarMasa;
		comenziMasa = new ArrayList<>();
	}
	
	public void preiaComanda(ComandaBucatarie comanda){
		this.comenziMasa.add(comanda);
	}
	
	public void trimiteComenzi(){
		for(ComandaBucatarie comanda : comenziMasa)
			comanda.gateste();
		this.comenziMasa.clear();
	}
}
