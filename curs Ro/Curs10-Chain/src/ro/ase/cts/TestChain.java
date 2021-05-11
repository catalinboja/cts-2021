package ro.ase.cts;

public class TestChain {
	public static void main(String[] args){
		ProcesatorMesaje pm = new ProcesatorMesaje();
		ProcesatorMesajePrioritate pmp = new ProcesatorMesajePrioritate();
		ProcesatorMesajePrioritateMaxima pmpm = new ProcesatorMesajePrioritateMaxima();
		
		pmpm.setSuccessor(pmp);
		pmp.setSuccessor(pm);
		
		Mesaj m1 = new Mesaj("Alarma incendiu !",200);
		Mesaj m2 = new Mesaj("Usa deschisa birou 302 !",50);
		Mesaj m3 = new Mesaj("Test securitate !",78);
		
		pmpm.gestioneazaCerere(m1);
		pmpm.gestioneazaCerere(m2);
		pmpm.gestioneazaCerere(m3);
		
	}
}
