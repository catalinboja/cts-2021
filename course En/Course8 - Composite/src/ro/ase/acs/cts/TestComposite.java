package ro.ase.acs.cts;

public class TestComposite {

	public static void main(String[] args) {
		
		//define a department
		OrganigramStructure departamentIT = 
				new OrganigramStructure("DepartamentIT", "IT Department");
		
		
		//define a composite node
		OrganigramStructure devTeam = 
				new OrganigramStructure("Dev team", "Programmers team");
		
		//add employees in team
		devTeam.addChildNode(new Employee("Popescu", "Software Eng"));
		devTeam.addChildNode(new Employee("Ionescu", "Software Eng"));
		
		//add child nodes
		departamentIT.addChildNode(new Employee("John", "Department Manager"));
		departamentIT.addChildNode(devTeam);
		
		//display structure
		System.out.println(departamentIT.getInfo());
		
	}
}
