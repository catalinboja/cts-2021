package ro.ase.csie.cts.dp.singleton;

public class ConexiuneBD {
	String ip;
	int port;
	String bd;
	
	//referinta catre obiectul unic
	//lazy-instantiation
	private static ConexiuneBD conexiune = null;
	
	private ConexiuneBD() {
		System.out.println("Creare conexiune");
	}

	private ConexiuneBD(String ip, int port, String bd) {
		System.out.println("Creare conexiune");
		this.ip = ip;
		this.port = port;
		this.bd = bd;
	}
	
	public static ConexiuneBD getConexiune() {
		if(conexiune == null) {
			conexiune = new ConexiuneBD();
			//preluare valori atribute dintr-un fisier de configurare
			conexiune.ip = "127.0.0.1";
			conexiune.port = 3306;
			conexiune.bd = "licenta";
		}
		
		return conexiune;
	}
	
	//varianta fara fisier de configurare
	//nu este Clean - la apel genereaza ideea ca ai mai multe conexiuni
	public static ConexiuneBD getConexiune(String ip, int port, String bd) {
		if(conexiune == null) {
			conexiune = new ConexiuneBD();
			//preluare valori atribute dintr-un fisier de configurare
			conexiune.ip = ip;
			conexiune.port = port;
			conexiune.bd = bd;
		}
		
		return conexiune;
	}
	
	
	
}
