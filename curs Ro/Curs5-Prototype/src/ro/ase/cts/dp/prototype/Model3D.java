package ro.ase.cts.dp.prototype;

import java.util.ArrayList;

public class Model3D implements Cloneable {
	
	protected String id;
	
	protected ArrayList<Object> poligoane = new ArrayList<>();
	protected String tip;
	
	public Model3D(String tip) {
		try {
			System.out.println("Working ....");
			Thread.currentThread().sleep(2000);
			//creare lista de poligoane
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.tip = tip;
	}
	
	private Model3D() {
		
	}

	public String getType() {
		return tip;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Object> getVertices(){
		return this.poligoane;
	}
	
	

	@Override
	public String toString() {
		return "Model 3D " + this.tip + " cu id " + this.id;
	}

	@Override
	protected Object clone() {

		//deep-copy
		Model3D copie = new Model3D();
		copie.id = this.id;
		//NU asa
		//copie.poligoane = this.poligoane;
		copie.poligoane = (ArrayList<Object>) this.poligoane.clone();
		copie.tip = this.tip;
		
		return copie;
		
		//atentie NU asa
		//return this;
		
		
	}
	
	
	
}
