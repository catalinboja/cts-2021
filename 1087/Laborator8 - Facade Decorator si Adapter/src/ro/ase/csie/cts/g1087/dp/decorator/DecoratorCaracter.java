package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;

public abstract class DecoratorCaracter extends ACMECaracterJoc{
	
	ACMECaracterJoc caracter = null;

	public DecoratorCaracter(ACMECaracterJoc caracter) {
		super(caracter.getNume(), caracter.getPuncteViata());
		this.caracter = caracter;
	}

	@Override
	public void seDeplaseaza() {
		this.caracter.seDeplaseaza();
	}

	@Override
	public void esteLovit(int puncte) {
		this.caracter.esteLovit(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		this.caracter.seVindeca(puncte);
	}
	
	
}
