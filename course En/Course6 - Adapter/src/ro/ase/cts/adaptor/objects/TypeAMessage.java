package ro.ase.cts.adaptor.objects;


public class TypeAMessage implements TypeAInterface{
	String text;
	
	public TypeAMessage(){
		this.text = "Mesaj default A";
	}

	@Override
	public String getText(){
		return text;
	}
	
	@Override
	public void setText(String text){
		this.text = text;
	}
	
	@Override
	public void afisare(){
		System.out.println("Mesajul este "+this.text);
	}
}
