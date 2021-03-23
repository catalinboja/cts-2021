package ro.ase.csie.cts.dp.singleton.refstatica;

public class ConexiuneBD {
	String ip;
	int port;
	String bd;
	
	//referinta catre obiectul unic
	//eager-instantiation
	public final static ConexiuneBD conexiune = new ConexiuneBD();
	
	
	//constructor static al clasei
	//se apeleaza o singura data cand clasa este incarcata de JVM
	static {
		System.out.println("Incarcare clasa de catre JVM");
		System.out.println("Preluare date de configurare aplicatie");
	}
	
	//se executa inainte de fiecare cosntructor
	{
		System.out.println("Apel inainte de constructor");
	}
	
	private ConexiuneBD() {
		//preluare date conexiune din fisiere, servicii Web, etc
		System.out.println("Creare conexiune");
	}

}
