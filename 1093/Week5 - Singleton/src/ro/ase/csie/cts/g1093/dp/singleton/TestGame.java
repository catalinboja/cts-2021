package ro.ase.csie.cts.g1093.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
		
		//RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend();
		
		//RESTBackend backend1 = new RESTBackend();
		//RESTBackend backend2 = new RESTBackend();
		
		
		UIModule uiModule = new UIModule();
		PlayerModule plyerModule = new PlayerModule();
		
		/*
		 * RESTBackend backend2 =
		 * RESTBackend.getRESTBackend("www.acs.ase.ro/game","test"); RESTBackend
		 * backend3 =
		 * RESTBackend.getRESTBackend("www.acs.ase.ro/payments","VISA Check");
		 */ 
			
	}

}
