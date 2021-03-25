package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class RESTBackend {
	
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	

	//executed only once
	static {
		System.out.println("Is executed when the class is loaded by the JVM");
		theBackend = new RESTBackend();
		
		//get the data from config files or something else

		theBackend.url = "www.acs.ase.ro/cts";
	}

	//another block
	{
		System.out.println("Is executed before any constructor call");
	}

	private RESTBackend() {
		
	}
	
	/*
	 * private RESTBackend() { //get the data from config files or something else }
	 */
}
