package ro.ase.cts;

public class Window {
	protected boolean isClosed = true;
	
	public void close(){
		this.isClosed = true;
	}
	
	public void open(){
		this.isClosed = false;
	}
}
