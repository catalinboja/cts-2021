package ro.ase.csie.cts.dp.singleton.registru;

import java.util.HashMap;


public class ConexiuneBD {
	String ip;
	int port;
	String bd;
	
	private static HashMap<String, ConexiuneBD> registruConexiuni = new HashMap<>();
	
	private ConexiuneBD(String ip, int port, String bd) {
		System.out.println("Creare conexiune");
		this.ip = ip;
		this.port = port;
		this.bd = bd;
	}
	
	public static ConexiuneBD getConexiune(String ip, int port, String bd) {
		ConexiuneBD conexiune = registruConexiuni.get(ip);
		if(conexiune == null) {
			conexiune = new ConexiuneBD(ip, port, bd);
			registruConexiuni.put(ip,conexiune);
		}
		return conexiune;
	}
}
