package ro.ase.acs.cts.test;

import ro.ase.acs.cts.ConexiuneBD;
import ro.ase.acs.cts.singleton.exemplu.SingletonConexiuneBD;

public class InterfaceModule {
	SingletonConexiuneBD bd1;
	
	public InterfaceModule() {
		//bd1 = new SingletonConexiuneBD("127.0.0.l:3060", "user", "12345678");
		bd1 = SingletonConexiuneBD.getConnection();
	}
}
