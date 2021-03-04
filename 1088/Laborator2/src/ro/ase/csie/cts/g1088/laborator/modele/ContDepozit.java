package ro.ase.csie.cts.g1088.laborator.modele;

import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;
import ro.ase.csie.cts.g1088.laborator.interfete.Profitabil;

public class ContDepozit extends ContBancar implements Profitabil{
	
	public static final double BALANTA_MINIMA = 100;
	
	public ContDepozit(String iban) {
		super(BALANTA_MINIMA, iban);
	}

	@Override
	public void alimenteaza(Double valoare) {
		this.balanta += valoare;
	}

	@Override
	public void extrage(Double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta < valoare) {
			throw new ExceptieFonduriInsuficiente("Nu ai bani");
		}
		else
		{
			this.balanta -= valoare;
		}
	}

	@Override
	public void transfer(Cont destinatie, Double valoare) 
			throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(this == destinatie) {
			throw new ExceptieTransferIlegal();
		}
		this.extrage(valoare);
		destinatie.alimenteaza(valoare);
	}

	@Override
	public void adaugaDobanda(double procentDobanda) {
		this.balanta *= (1 + procentDobanda/100);
	}
	
	
}
