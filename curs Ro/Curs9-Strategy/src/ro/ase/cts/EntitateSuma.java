package ro.ase.cts;

public class EntitateSuma implements IProcesabil{

	@Override
	public int proceseaza(int[] valori) {
		if(valori == null)
			return 0;
		int suma = 0;
		for(int i=0;i<valori.length;i++)
			suma+=valori[i];
		return suma;
	}

}
