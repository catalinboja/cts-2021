package ro.ase.cts;

public class ProcesatorMesajePrioritate extends Handler{
	public void gestioneazaCerere(Mesaj mesaj)
	{
		if (mesaj.getPrioritate() > 50 && mesaj.getPrioritate() <= 100){
			System.out.println("\n Mesaj cu prioritate: "+mesaj.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.gestioneazaCerere(mesaj);
		}
	}
}
