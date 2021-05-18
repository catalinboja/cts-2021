package ro.ase.csie.cts.g1092.dp.observer;

public class AutoSaveModule implements NetworkEventHandlerInterface{

	@Override
	public void notifyNetworkDown() {
		System.out.println("Saving player data ....");
	}

	@Override
	public void notifyNetworkUp() {
		System.out.println("Ask player to restore data ....");
	}

}
