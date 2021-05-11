package ro.ase.cts;

//Command concret pentru Pizza

public class ComandaPizza implements ComandaBucatarie {

	private Bucatar bucatar;
	private String tip;
	
	@Override
	public void gateste() {
		bucatar.preparaPizza(this.tip);
	}
	
	public ComandaPizza(Bucatar bucatar, String tip){
		this.bucatar = bucatar;
		this.tip = tip;
	}

}
