package ro.ase.csie.cts.dp.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
		
		ConexiuneBD con1 = ConexiuneBD.getConexiune("127.0.0.1", 3306, "test");
		ConexiuneBD con2 = ConexiuneBD.getConexiune("10.0.0.1", 3306, "prod");
		
		if(con1 != con2) {
			System.out.println("Conexiuni diferite catre servere diferite");
		}
		
		ConexiuneBD con3 = ConexiuneBD.getConexiune("10.0.0.1", 3306, "prod");
		if(con2 == con3) {
			System.out.println("Conexiuni identice");
		}
	}

}
