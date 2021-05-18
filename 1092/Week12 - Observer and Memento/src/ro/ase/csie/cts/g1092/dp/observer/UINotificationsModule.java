package ro.ase.csie.cts.g1092.dp.observer;

public class UINotificationsModule implements NetworkEventHandlerInterface{

	@Override
	public void notifyNetworkDown() {
		System.out.println("Notify player: Network lost");
	}

	@Override
	public void notifyNetworkUp() {
		System.out.println("Notify player: Connection up");
		
	}

}
