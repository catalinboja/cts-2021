package ro.ase.csie.cts.g1094.dp.chain;

public class PrivateChat extends ChatHandler{

	@Override
	public void processMessage(Message msg) {
		if(!msg.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Private message for " + msg.destination + ": " + msg.text);
		}
		else
		{
			if(this.next != null) {
				this.next.processMessage(msg);
			}
		}
	}

}
