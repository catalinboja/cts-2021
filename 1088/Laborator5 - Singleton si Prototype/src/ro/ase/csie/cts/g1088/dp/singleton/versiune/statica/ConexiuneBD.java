package ro.ase.csie.cts.g1088.dp.singleton.versiune.statica;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	public static final ConexiuneBD conexiune;
	
	static {
	
		//preluare date conexiune din alte surse
		String ip = "127.0.0.1";
		String denumire = "bdtest";
		conexiune = new ConexiuneBD(ip, denumire);
	}

	private ConexiuneBD(String ip, String denumire) {
		this.ip = ip;
		this.denumire = denumire;
	}
	
}
