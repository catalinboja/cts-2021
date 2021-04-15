package ro.ase.acs.cts;

public class TestComposite {

	public static void main(String[] args) {
		
		//define a department
		OrganigramStructure departamentIT = 
				new OrganigramStructure("DepartamentIT", "Departamentul care asigura suportul IT");
		
		
		//define a composite node
		OrganigramStructure echipaDezvoltare = 
				new OrganigramStructure("Echipa dezvoltare", "Echipa programatori");
		
		//add employees in team
		echipaDezvoltare.addChildNode(new Employee("Popescu", "programator"));
		echipaDezvoltare.addChildNode(new Employee("Ionescu", "programator"));
		
		//add child nodes
		departamentIT.addChildNode(new Employee("Ion", "Manager departament"));
		departamentIT.addChildNode(echipaDezvoltare);
		
		//display structure
		System.out.println(departamentIT.getInfo());
		
	}
}
