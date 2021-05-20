package ro.ase.csie.cts.g1088.dp.observer;

public class ModulNotificariUI implements InterfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("PopUP: Conexiune pierduta");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUP: Conexiune Activa");
	}

}
