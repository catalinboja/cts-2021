package ro.ase.cts;

public class WashingMachine {
	protected boolean isStopped = true;
	
	public void stop(){
		this.isStopped = true;
	}
	
	public void start(){
		this.isStopped = false;
	}
}
