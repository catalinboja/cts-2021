package ro.ase.cts;

public class StyleNormal implements IPrintable{

	@Override
	public void print(String text) {
		System.out.println("Normal: "+text);
	}
}
