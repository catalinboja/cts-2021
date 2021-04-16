package ro.ase.csie.cts.g1087.dp.composite;

import java.util.ArrayList;

public class GrupCaractere extends NodAbstractStructura {
	
	ArrayList<NodAbstractStructura> noduri = new ArrayList<>();
	String denumire;
	
	public GrupCaractere(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void atacaJucator(String numeJucator) {
		for(NodAbstractStructura nod : noduri)
			nod.atacaJucator(numeJucator);
	}

	@Override
	public void seRetrage() {
		for(NodAbstractStructura nod : noduri)
			nod.seRetrage();
	}

	@Override
	public void seDeplaseaza() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		this.noduri.add(nod);
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		this.noduri.remove(nod);
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		return this.noduri.get(index);
	}

}
