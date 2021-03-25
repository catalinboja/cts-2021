package ro.ase.csie.cts.g1088.dp.singleton.versiune.statica;

public class TestSingleton {

	public static void main(String[] args) {
		
		ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
		ConexiuneBD conexiune2 = ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 conexiuni sunt identice");
		}
	}

}
