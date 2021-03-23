package ro.ase.csie.cts.dp.singleton.refstatica;

public class TestSingletonRef {

	public static void main(String[] args) {
		System.out.println("Start aplicatie");
		ConexiuneBD con1 = ConexiuneBD.conexiune;
		ConexiuneBD con2 = ConexiuneBD.conexiune;
	}

}
