package ro.ase.csie.cts.dp.singleton.enumerare;

import ro.ase.csie.cts.dp.singleton.ConexiuneBD;

public enum ConexiuneDb {
	CONEXIUNE;
	
	String ip;
	int port;
	String bd;
		
	private ConexiuneDb() {
		System.out.println("Apel constructor enumerare");
		//preluare date dintr-un fisier de configurare
		ip = "27.0.0.1";
		port = 1443;
		bd = "cts";
	}

	public String getIp() {
		return ip;
	}

	public int getPort() {
		return port;
	}

	public String getBd() {
		return bd;
	}
	
	
		
}
