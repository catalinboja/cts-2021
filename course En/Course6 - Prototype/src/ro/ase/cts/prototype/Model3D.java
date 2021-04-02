package ro.ase.cts.prototype;

import java.util.ArrayList;

public abstract class Model3D implements Cloneable {
	
	private String id;
	
	protected ArrayList<Object> points;
	protected String type;

	abstract void draw();
	
	public Model3D() {
		
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Object> getVertices(){
		return this.points;
	}

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}

		return clone;
	}

	@Override
	public String toString() {
		return "3D Model " + this.type + " with id " + this.id;
	}
}
