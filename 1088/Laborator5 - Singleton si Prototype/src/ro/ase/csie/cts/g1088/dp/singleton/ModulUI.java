package ro.ase.csie.cts.g1088.dp.singleton;

public class ModulUI {
	public ModulUI() {
		//ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1", "superGame");
		ConexiuneBD conexiune = ConexiuneBD.getConexiune();
	}
}
