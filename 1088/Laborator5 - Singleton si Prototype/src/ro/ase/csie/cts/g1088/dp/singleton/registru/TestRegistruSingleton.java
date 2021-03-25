package ro.ase.csie.cts.g1088.dp.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
		
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune3 = ConexiuneBD.getConexiune("127.0.0.1", "test");
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 referinte sunt identice");
		}
		else
		{
			System.out.println("Cele 2 referinte sunt diferite");
		}
		
		if(conexiune1 == conexiune3) {
			System.out.println("Cele 2 referinte sunt identice");
		}
		else
		{
			System.out.println("Cele 2 referinte sunt diferite");
		}
		
	}

}
