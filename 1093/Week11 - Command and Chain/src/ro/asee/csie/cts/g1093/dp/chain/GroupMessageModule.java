package ro.asee.csie.cts.g1093.dp.chain;

public class GroupMessageModule extends GenericMessageHandler{

	@Override
	public void processMessage(Message message) {
		if(message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Group message: " + message.text);
		}
		
		if(this.next != null) {
			this.next.processMessage(message);
		}
		
	}

}
