package ro.ase.csie.cts.g1092.dp.chain;

public class BroadcastMessageHandler extends ChatHandler{

	@Override
	public void processMessage(ChatMessage msg) {
		
		if(msg.destination.toLowerCase().equals("@everyone")) {
			System.out.println("@everyone: " + msg.text);
		}
		
		if(this.next != null) {
			this.next.processMessage(msg);
		}
		
	}

}
