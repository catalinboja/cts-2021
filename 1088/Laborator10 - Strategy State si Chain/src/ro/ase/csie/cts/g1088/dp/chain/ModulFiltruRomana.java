package ro.ase.csie.cts.g1088.dp.chain;

public class ModulFiltruRomana extends ModulProcesareMesaj{
	
	public static final String[] dictionar = new String[] {"rau","violent","neprietenos"};
	String limba;
	
	@Override
	public void procesareMesaj(MesajChat mesaj) {
		boolean esteValid = true;
		for(String cuvant : dictionar) {
			if(mesaj.text.toLowerCase().contains(cuvant)) {
				esteValid = false;
				break;
			}
		}
		
		if(esteValid && this.next != null)
			this.next.procesareMesaj(mesaj);
	}

}
