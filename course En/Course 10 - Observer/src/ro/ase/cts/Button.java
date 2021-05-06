package ro.ase.cts;

public class Button extends Clickable{
	private boolean isClicked = false;
	
	public void setClicked(){
		if(!isClicked)
		{
			isClicked = true;
			this.notifyObservers();
		}
		else
			isClicked = false;
	}
	
	public void Click(){
		System.out.println("Buton apasat");
		setClicked();
		//sau
		//this.notifyObservers();
	}
}
