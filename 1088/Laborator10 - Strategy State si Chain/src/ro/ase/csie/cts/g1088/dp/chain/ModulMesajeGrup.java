package ro.ase.csie.cts.g1088.dp.chain;

public class ModulMesajeGrup extends ModulProcesareMesaj{

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if(mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("Mesaj pentru grup: " + mesaj.text);
		}
		
		if(this.next != null) {
			this.next.procesareMesaj(mesaj);
		}
	}

}
