package ro.ase.cts.adaptor.objects;



public class TypeBMessage implements TypeBInterface{
	String[] words;
	
	public TypeBMessage(){
		this.words = new String("Mesaj default tip B").split(" ");
	}

	@Override
	public String[] getText(){
		return this.words;
	}

	@Override
	public void setText(String[] words){
		
		words = new String[words.length];
		System.arraycopy(words, 0, words, 0, words.length);
	}

	@Override
	public void display() {
		System.out.println("Mesaj:");
		for(int i = 0;i<words.length;i++)
			System.out.print(words[i] + "*");
		System.out.print('\n');
	}
}

