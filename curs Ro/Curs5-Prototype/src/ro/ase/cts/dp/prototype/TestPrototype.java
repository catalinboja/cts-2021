package ro.ase.cts.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		Model3D asteroid1 = new Model3D("asteroid");
		//Model3D asteroid2 = new Model3D("asteroid");
		
		Model3D asteroid2 = (Model3D) asteroid1.clone();
		Model3D asteroid3 = (Model3D) asteroid1.clone();
		Model3D asteroid4 = (Model3D) asteroid1.clone();
		
		
		
		System.out.println("Terminat generare scenariu joc");
	}

}
