package ro.ase.cts.adaptor.obiecte;

import java.util.ArrayList;

public class TestAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// colectie mesaje tipA
		ArrayList<MesajTipA> mesajeTipA = new ArrayList<>();
		mesajeTipA.add(new MesajTipA());
		mesajeTipA.add(new MesajTipA());

		for (MesajTipA mesaj : mesajeTipA)
			mesaj.afisare();

		
		// colectie mesaje tipB
		ArrayList<InterfataTipB> mesajeTipB = new ArrayList<>();
		mesajeTipB.add(new MesajTipB());
		mesajeTipB.add(new MesajTipB());

		for (InterfataTipB mesaj : mesajeTipB)
			mesaj.display();

		
		
		// solutia clasica - fara pattern
		ArrayList<Object> mesajeGenerice = new ArrayList<>();
		mesajeGenerice.add(new MesajTipA());
		mesajeGenerice.add(new MesajTipB());

		for (Object mesaj : mesajeGenerice) {
			if (mesaj instanceof MesajTipA) {
				((MesajTipA) mesaj).afisare();
			} else if (mesaj instanceof MesajTipB) {
				((MesajTipB) mesaj).display();;
			}
		}

		
		System.out.println("----------------------------");
		
		//cu Adapter
		MesajTipA mA = new MesajTipA();
		mA.setText("Exemplu de Adapter");
		Adaptor a2B = new Adaptor(mA);
		
		mesajeTipB.add(a2B);
		
		for (InterfataTipB mesaj : mesajeTipB)
			mesaj.display();
		
		
		System.out.println("----------------------------");
		
		
		
		
		
		System.out.println("******* TEST adaptor obiecte");
		
		MesajTipA objA = new MesajTipA();
		objA.setText("Hello Adapter !");
		objA.afisare();

		Adaptor adaptor2B = new Adaptor(objA);
		InterfataTipB objB = adaptor2B;
		objB.setText(new String[] { "Hello", "World" });
		objB.display();
		
		System.out.println("******* TEST adaptor pe colectie obiecte");
		
		ArrayList<InterfataTipB> mesajeTipB_2 = new ArrayList<>();
		mesajeTipB_2.add(new MesajTipB());
		mesajeTipB_2.add( new Adaptor(objA));
		
		for(InterfataTipB mesaj : mesajeTipB_2)
			mesaj.display();
		
	}

}
