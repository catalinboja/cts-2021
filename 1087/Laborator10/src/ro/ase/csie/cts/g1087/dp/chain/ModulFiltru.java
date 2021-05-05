package ro.ase.csie.cts.g1087.dp.chain;

public class ModulFiltru extends NodChainAbstract{

	public ModulFiltru(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		String[] dictionar = new String[] {"rau","obraznic","violent"};
		boolean esteValid = true;
		
		for(String cuvant : dictionar) {
			if(mesaj.getContinut().contains(cuvant)) {
				esteValid = false;
				break;
			}
		}
		
		if(esteValid && this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
		
	}

}
