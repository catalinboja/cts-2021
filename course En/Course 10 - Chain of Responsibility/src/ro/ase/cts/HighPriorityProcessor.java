package ro.ase.cts;

public class HighPriorityProcessor extends Handler{
	public void manageRequest(Message msg)
	{
		if (msg.getPriority() > 50 && msg.getPriority() <= 100){
			System.out.println("\n Message with high priority: "+msg.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.manageRequest(msg);
		}
	}
}
