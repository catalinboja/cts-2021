package ro.ase.cts.adaptor.objects;

public class MsgAdapter implements TypeBInterface{
	
	TypeAInterface tipA;
	
	public MsgAdapter(TypeAInterface ref){
		tipA = ref;
	}

	@Override
	public String[] getText() {
		return tipA.getText().split(" ");
	}

	@Override
	public void setText(String[] words) {
		StringBuilder builder = new StringBuilder();
		for(String s : words) {
		    builder.append(s+" ");
		}
		tipA.setText(builder.toString());
		
	}

	@Override
	public void display() {
		tipA.print();
	}

}
