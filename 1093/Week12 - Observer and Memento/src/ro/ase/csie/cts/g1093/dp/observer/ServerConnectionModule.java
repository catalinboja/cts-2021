package ro.ase.csie.cts.g1093.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ServerConnectionModule {
	
	List<ConnectionStatusInterface> modules = new ArrayList<>();
	
	public void register(ConnectionStatusInterface module) {
		this.modules.add(module);
	}
	
	public void unregister(ConnectionStatusInterface module) {
		this.modules.remove(module);
	}
	
	public void detectConnectionStatusChange(ConnectionStatus status) {
		if(status == ConnectionStatus.UP) {
			for(ConnectionStatusInterface module : modules) {
				module.connectionUp();
			}
		}
		
		if(status == ConnectionStatus.DOWN) {
			for(ConnectionStatusInterface module : modules) {
				module.connectionDown();
			}
		}
	}
}
