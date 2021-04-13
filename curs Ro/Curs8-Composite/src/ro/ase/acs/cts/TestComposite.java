package ro.ase.acs.cts;

public class TestComposite {

	public static void main(String[] args) {
		
		//definire structura organizatorica
		StructuraOrganizatorica departamentIT = 
				new StructuraOrganizatorica("DepartamentIT", "Departamentul care asigura suportul IT");
		
		
		//definire nod composite 
		StructuraOrganizatorica echipaDezvoltare = 
				new StructuraOrganizatorica("Echipa dezvoltare", "Echipa programatori");
		
		//adaugare angajati in echipa 
		echipaDezvoltare.adaugaNodCopil(new Angajat("Popescu", "programator"));
		echipaDezvoltare.adaugaNodCopil(new Angajat("Ionescu", "programator"));
		
		//adaugare noduri copil
		departamentIT.adaugaNodCopil(new Angajat("Ion", "Manager departament"));
		departamentIT.adaugaNodCopil(echipaDezvoltare);
		
		//afisare structura
		System.out.println(departamentIT.getInfo());
		
	}
}
