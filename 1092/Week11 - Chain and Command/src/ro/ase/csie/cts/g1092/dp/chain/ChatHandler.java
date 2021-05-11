package ro.ase.csie.cts.g1092.dp.chain;

public abstract class ChatHandler {
	
	ChatHandler next = null;
	
	
	public void setNext(ChatHandler next) {
		this.next = next;
	}

	public abstract void processMessage(ChatMessage msg);
	
}
