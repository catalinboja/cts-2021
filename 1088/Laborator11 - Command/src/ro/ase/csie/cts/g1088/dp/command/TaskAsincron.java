package ro.ase.csie.cts.g1088.dp.command;

public class TaskAsincron implements InterfataTaskAsincron{
	
	private InterfataModulJoc modul = null;
	private String detalii;
	int prioritate;
	
	
	public TaskAsincron(InterfataModulJoc modul, String detalii, int prioritate) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.prioritate = prioritate;
	}


	@Override
	public void startTaskAsincron() {
		this.modul.executaTask(detalii);
	}

}
