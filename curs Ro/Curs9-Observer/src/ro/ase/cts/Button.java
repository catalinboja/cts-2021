package ro.ase.cts;

public class Button extends Clickabil{
	private boolean isClicked = false;
	
	public void setClicked(){
		if(!isClicked)
		{
			isClicked = true;
			this.notificareObservatori();
		}
		else
			isClicked = false;
	}
	
	public void Click(){
		System.out.println("Buton apasat");
		setClicked();
		//sau
		//this.notificareObservatori();
	}
}
