package ro.ase.csie.cts.g1087.dp.state;

public class TestState {

	public static void main(String[] args) {
		SuperErou superman = new SuperErou("Superman", 100);
		
		superman.seDeplaseaza();
		superman.esteAtacat(50);
		superman.seDeplaseaza();
		superman.esteAtacat(45);
		superman.seDeplaseaza();
		superman.seVindeca(30);
		superman.seDeplaseaza();
	}

}
