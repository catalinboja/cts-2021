package ro.ase.csie.cts.g1093.dp.singleton;

public class UIModule {
	
	public UIModule() {
		//RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
