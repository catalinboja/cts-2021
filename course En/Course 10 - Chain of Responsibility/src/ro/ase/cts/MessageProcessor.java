package ro.ase.cts;

public class MessageProcessor extends Handler{
	public void manageRequest(Message msg)
	{
		if (msg.getPriority() <= 50){
			System.out.println("\n Message: "+msg.getText());
		}
	}
}
