package ro.ase.cts;

public class MaximumPriorityProcessor extends Handler{
	public void manageRequest(Message msg)
	{
		if (msg.getPriority() > 100){
			System.out.println("\n Message with maximum priority: "+msg.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.manageRequest(msg);
		}
	}
}
