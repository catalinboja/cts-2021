package ro.ase.csie.cts.g1093.dp.singleton.registry;

import java.util.Hashtable;

public class RESTBackend{
	String url;
	String data;
	
	private static Hashtable<String, RESTBackend> backends = 
			new Hashtable<>();

	private RESTBackend(String url, String data) {
		super();
		this.url = url;
		this.data = data;
	}
	
	public static RESTBackend getRESTBackend(String url, String data) {
		RESTBackend backend = backends.get(url);
		if(backend == null) {
			backend = new RESTBackend(url, data);
			backends.put(url, backend);
		}
		
		return backend;
	}
	
}
