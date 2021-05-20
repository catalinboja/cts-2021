package ro.ase.csie.cts.g1088.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {
	List<MementoSuperErou> salvari = new ArrayList<>();
	
	public void adaugaSalvare(MementoSuperErou memento) {
		this.salvari.add(memento);
	}
	
	public MementoSuperErou getUltimaSalvare() {
		if(this.salvari.size() > 0) {
			MementoSuperErou ultimaSalvare = this.salvari.get(this.salvari.size()-1);
			this.salvari.remove(ultimaSalvare);
			return ultimaSalvare;
		}
		else {
			return null;
		}
	}
}
