package ro.ase.csie.cts.g1088.dp.proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {
	
	InterfataLogin modulOficial;
	public static int NR_MAXIM = 3;
	Map<String, Integer> utilizatori = new HashMap<>();
	
	
	public ProxyLogin(InterfataLogin modulOficial) {
		super();
		this.modulOficial = modulOficial;
	}

	@Override
	public boolean login(String user, String pass) {
		Integer nrIncercari = utilizatori.get(user);
		if(nrIncercari == null) {
			utilizatori.put(user, 0);
			nrIncercari = 0;
		}
		
		if(nrIncercari >= NR_MAXIM) {
			return false;
		}
		
		if(modulOficial.login(user, pass)) {
			utilizatori.put(user, 0);
			return true;
		}
		else
		{
			nrIncercari += 1;
			utilizatori.put(user, nrIncercari);
			if(nrIncercari == NR_MAXIM) {
				System.out.println("Blocare cont");
			}
			return false;
		}
		
	}

	@Override
	public boolean verificaStatusServer() {
		return modulOficial.verificaStatusServer(); 
	}

}
