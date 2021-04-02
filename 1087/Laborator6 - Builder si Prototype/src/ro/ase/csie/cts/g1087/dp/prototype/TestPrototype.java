package ro.ase.csie.cts.g1087.dp.prototype;

public class TestPrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Model3DCaracter superman1 = new Model3DCaracter("albastru");
		//Model3DCaracter superman2 = new Model3DCaracter("albastru");
		
		Model3DCaracter superman2 = (Model3DCaracter) superman1.clone();
		
	}
	
}
