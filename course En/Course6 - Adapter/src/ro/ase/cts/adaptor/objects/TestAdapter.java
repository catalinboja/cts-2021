package ro.ase.cts.adaptor.objects;

import java.util.ArrayList;

public class TestAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// colectie mesaje tipA
		ArrayList<TypeAMessage> mesajeTipA = new ArrayList<>();
		mesajeTipA.add(new TypeAMessage());
		mesajeTipA.add(new TypeAMessage());

		for (TypeAMessage mesaj : mesajeTipA)
			mesaj.afisare();

		
		// colectie mesaje tipB
		ArrayList<TypeBMessage> mesajeTipB = new ArrayList<>();
		mesajeTipB.add(new TypeBMessage());
		mesajeTipB.add(new TypeBMessage());

		for (TypeBMessage mesaj : mesajeTipB)
			mesaj.display();

		
		
		// solutia clasica
		ArrayList<Object> mesajeGenerice = new ArrayList<>();
		mesajeGenerice.add(new TypeAMessage());
		mesajeGenerice.add(new TypeBMessage());

		for (Object mesaj : mesajeGenerice) {
			if (mesaj instanceof TypeAMessage) {
				((TypeAMessage) mesaj).afisare();
			} else if (mesaj instanceof TypeBMessage) {
				((TypeBMessage) mesaj).display();;
			}
		}

		
		
		
		
		
		
		
		
		
		
		System.out.println("******* TEST adaptor obiecte");
		
		TypeAMessage objA = new TypeAMessage();
		objA.setText("Hello Adapter !");
		objA.afisare();

		Adaptor adaptor2B = new Adaptor(objA);
		TypeBInterface objB = adaptor2B;
		objB.setText(new String[] { "Hello", "World" });
		objB.display();
		
		System.out.println("******* TEST adaptor pe colectie obiecte");
		
		ArrayList<TypeBInterface> mesajeTipB_2 = new ArrayList<>();
		mesajeTipB_2.add(new TypeBMessage());
		mesajeTipB_2.add( new Adaptor(objA));
		
		for(TypeBInterface mesaj : mesajeTipB_2)
			mesaj.display();
		
	}

}
