package ro.ase.cts.adaptor.objects;

public class Adaptor implements TypeBInterface{
	
	TypeAInterface tipA;
	
	public Adaptor(TypeAInterface ref){
		tipA = ref;
	}

	@Override
	public String[] getText() {
		return tipA.getText().split(" ");
	}

	@Override
	public void setText(String[] cuvinte) {
		StringBuilder builder = new StringBuilder();
		for(String s : cuvinte) {
		    builder.append(s+" ");
		}
		tipA.setText(builder.toString());
		
	}

	@Override
	public void display() {
		tipA.afisare();
	}

}
