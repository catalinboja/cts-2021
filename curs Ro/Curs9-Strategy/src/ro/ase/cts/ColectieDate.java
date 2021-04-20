package ro.ase.cts;

public class ColectieDate {
	protected int valori[];
	protected IProcesabil entitate;
	
	public ColectieDate(int n){
		valori = new int[n];
		for(int i = 0;i<n;i++)
			valori[i] = i+1;
	}
	
	public void setStrategie(IProcesabil entitate){
		this.entitate = entitate;
	}
	
	public int proceseazaDate(){
		if(entitate != null)
			return entitate.proceseaza(valori);
		else
			throw new UnsupportedOperationException();
	}
}
