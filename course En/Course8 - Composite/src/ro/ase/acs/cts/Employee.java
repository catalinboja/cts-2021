package ro.ase.acs.cts;

public class Employee extends HierarchyNode{
	
	String name;
	String position;
	double salary;
	
	public Employee(String name, String position){
		this.name = name;
		this.position = position;
	}
	
	public void setSalary(double value){
		this.salary = value;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPosition() {
		return this.position;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}
}
