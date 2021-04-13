package ro.ase.cts;


//Concrete Flyweight
public class Caracter implements CaracterPrintabil{

	private final String caracter;
	private int fontSize;
	//alte atribute specifice starii permanente
	
	public Caracter(String valoare){
		this.caracter = valoare;
	}
	
	public String getCaracter(){
		return this.caracter;
	}
	@Override
	public void printeazaCaracter(CaracterContext context) {
		System.out.println(this.caracter+ " este pe pozitia "+context.getPozitie());
		
	}

}
