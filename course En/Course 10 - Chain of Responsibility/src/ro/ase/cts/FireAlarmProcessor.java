package ro.ase.cts;

public class FireAlarmProcessor extends Handler{

	@Override
	public void manageRequest(Message msg) {
		if(msg.getText().toLowerCase().contains("fire")) {
			System.out.println("Calling fire department ....");
		}
		if(this.succesor!=null) {
			this.succesor.manageRequest(msg);
		}
	}

}
