package ro.ase.cts;

public class PizzaSimpla extends AbstractPizza {

	public PizzaSimpla(String Denumire, float Pret){
		this.denumire = Denumire;
		this.pret = Pret;
	}
	@Override
	public String getIngrediente() {
		return "Blat simplu, rosii";
	}

}
