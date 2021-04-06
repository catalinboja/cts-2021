package ro.ase.cts.adaptor.obiecte;



public class MesajTipB implements InterfataTipB{
	String[] cuvinte;
	
	public MesajTipB(){
		this.cuvinte = new String("Mesaj default tip B").split(" ");
	}

	@Override
	public String[] getText(){
		return this.cuvinte;
	}

	@Override
	public void setText(String[] Cuvinte){
		
		cuvinte = new String[Cuvinte.length];
		System.arraycopy(Cuvinte, 0, cuvinte, 0, Cuvinte.length);
	}

	@Override
	public void display() {
		System.out.println("Mesaj:");
		for(int i = 0;i<cuvinte.length;i++)
			System.out.print(cuvinte[i] + "*");
		System.out.print('\n');
	}
}

