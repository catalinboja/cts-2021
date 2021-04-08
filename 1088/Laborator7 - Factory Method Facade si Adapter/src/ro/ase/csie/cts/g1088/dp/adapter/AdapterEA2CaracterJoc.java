package ro.ase.csie.cts.g1088.dp.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc {
	
	InterfataCaracterEA caracterEA;

	public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}

	@Override
	public void seDeplaseaza() {
		
		caracterEA.move();
		
	}
	
	
}
