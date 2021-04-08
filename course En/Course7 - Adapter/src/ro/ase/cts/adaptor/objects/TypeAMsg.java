package ro.ase.cts.adaptor.objects;


public class TypeAMsg implements TypeAInterface{
	String text;
	
	public TypeAMsg(){
		this.text = "Message default A";
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
	public void print(){
		System.out.println("Message is "+this.text);
	}
}
