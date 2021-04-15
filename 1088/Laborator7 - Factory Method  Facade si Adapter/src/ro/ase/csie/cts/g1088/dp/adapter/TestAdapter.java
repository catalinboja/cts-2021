package ro.ase.csie.cts.g1088.dp.adapter;

import java.util.ArrayList;


import ro.ase.csie.cts.g1088.dp.factory.method.CaracterDisney;
import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class TestAdapter {

	public static void main(String[] args) {

		//.1 colectie caractere existente
		
		ArrayList<CaracterJoc> caractere = new ArrayList<>();
		caractere.add(new CaracterDisney("Donald"));
		
		//2. colectie caractere EA
		ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
		caractereEA.add(new CaracterGenericEA());
		
		//folosind un adapter
		InterfataCaracterEA caracterEA = new CaracterGenericEA();
		AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
		caractere.add(adapt);
		
		
	}

}
