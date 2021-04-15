package ro.ase.acs.cts;

public abstract class HierarchyNode {
	
	//public interface for node actions 
	public abstract String getName();
	public abstract String getPosition();
	public abstract double getSalary();
	
	//displays data
	public String getInfo(){
		return this.getName() + " - "+ this.getPosition();
	}
	
	//public interface to manage child nodes
	
	//adds a node
	public void addChildNode(HierarchyNode node){
		throw new UnsupportedOperationException();
	}
	
	//deletes a node
	public void deleteChildNode(HierarchyNode node){
		throw new UnsupportedOperationException();
	}
	
	//gets a node
	public HierarchyNode getChildNode(int i){
		throw new UnsupportedOperationException();
	}
	
}
