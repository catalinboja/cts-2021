package ro.ase.csie.cts.g1094.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		NetworkMonitorModule monitor  = new NetworkMonitorModule();
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		
		NetworkStatusHandlerInterface autosave = new AutoSaveModule();
		NetworkStatusHandlerInterface notifications = new UINotificationsModule();
		
		monitor.register(autosave);
		monitor.register(notifications);
		
		monitor.networkStatusChanged(NetworkStatus.DOWN);
		
		monitor.unregister(notifications);
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		
	}

}
