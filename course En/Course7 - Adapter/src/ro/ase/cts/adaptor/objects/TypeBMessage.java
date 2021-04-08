package ro.ase.cts.adaptor.objects;



public class TypeBMessage implements TypeBInterface{
	String[] words;
	
	public TypeBMessage(){
		this.words = new String("Message default type B").split(" ");
	}

	@Override
	public String[] getText(){
		return this.words;
	}

	@Override
	public void setText(String[] receivedWords){
		
		words = new String[receivedWords.length];
		System.arraycopy(words, 0, receivedWords, 0, receivedWords.length);
	}

	@Override
	public void display() {
		System.out.println("Message:");
		for(int i = 0;i<words.length;i++)
			System.out.print(words[i] + "*");
		System.out.print('\n');
	}
}

