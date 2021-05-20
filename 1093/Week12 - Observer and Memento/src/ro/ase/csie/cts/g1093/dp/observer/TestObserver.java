package ro.ase.csie.cts.g1093.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ServerConnectionModule connection = new ServerConnectionModule();
		
		ConnectionStatusInterface backup = new BackupModule();
		ConnectionStatusInterface notifications = new UserNotificationsModule();
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connection.register(notifications);
		connection.register(backup);
		
		connection.detectConnectionStatusChange(ConnectionStatus.DOWN);
		
		connection.unregister(backup);
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
	}

}
