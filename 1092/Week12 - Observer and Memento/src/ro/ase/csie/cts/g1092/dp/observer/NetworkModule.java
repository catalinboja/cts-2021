package ro.ase.csie.cts.g1092.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {
	
	List<NetworkEventHandlerInterface> modules = new ArrayList<>();
	
	public void registerModule(NetworkEventHandlerInterface module) {
		modules.add(module);
	}
	
	public void unregisterModule(NetworkEventHandlerInterface module) {
		modules.remove(module);
	}
	
	public void networkStatusChanged(NetworkStatus status) {
		if(status == NetworkStatus.UP) {
			for(NetworkEventHandlerInterface module : modules) {
				module.notifyNetworkUp();
			}
		}
		
		if(status == NetworkStatus.DOWN) {
			for(NetworkEventHandlerInterface module : modules) {
				module.notifyNetworkDown();
			}
		}
	}
	
	
}
