package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatGlobal extends NodChainAbstract{

	public ModulChatGlobal() {
		super("Modul Chat Global");
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {
			System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut());
		}
		
		if(this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
	}

}
