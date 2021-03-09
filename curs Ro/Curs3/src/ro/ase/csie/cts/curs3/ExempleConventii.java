package ro.ase.csie.cts.curs3;

public class ExempleConventii {
	
	public static void testVariabileLogice() {
		boolean esteCorect = true;
		
		if(esteCorect) {
			System.out.println("Este corect");
		}
		
		if(!esteCorect) {
			System.out.println("Este incorect");
		}
		
	}
	
	public static void initializareVariabilaLogica() {
		int nota = 8;
		boolean estePromovat = (nota >= 5) ? true : false;
	}
	
	public static void comparareStringuri() {
		String mesajInitial = "Totul este OK";
		String raspuns = "Totul este OK";
		
		if(mesajInitial == raspuns) {
			System.out.println("Mesajele sunt identice");
		}
		else {
			System.out.println("Mesajele sunt diferite");
		}
		
		raspuns = new String("Totul este OK");
		
		if(mesajInitial == raspuns) {
			System.out.println("Mesajele sunt identice");
		}
		else {
			System.out.println("Mesajele sunt diferite");
		}
		
		
		if(mesajInitial.equals(raspuns)) {
			System.out.println("Mesajele sunt identice");
		}
		else {
			System.out.println("Mesajele sunt diferite");
		}
	}
}





