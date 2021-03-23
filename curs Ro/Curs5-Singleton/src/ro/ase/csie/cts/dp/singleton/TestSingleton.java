package ro.ase.csie.cts.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		//ConexiuneBD con1 = new ConexiuneBD();
		//ConexiuneBD con2 = new ConexiuneBD();
		
		ConexiuneBD con1 = ConexiuneBD.getConexiune();
		ConexiuneBD con2 = ConexiuneBD.getConexiune();
		
		
		//nu este Clean
		//ConexiuneBD con1 = ConexiuneBD.getConexiune("127.0.0.1", 3306, "licenta");
		//ConexiuneBD con2 = ConexiuneBD.getConexiune("10.0.0.1", 3306, "examen");
		
		if(con1 == con2) {
			System.out.println("Referinte catre acelasi obiect");
		}
		
	}

}
