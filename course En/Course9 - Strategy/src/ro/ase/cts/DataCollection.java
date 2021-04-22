package ro.ase.cts;

public class DataCollection {
	protected int values[];
	protected IProcessable externalEntity;
	
	public DataCollection(int n){
		values = new int[n];
		for(int i = 0;i<n;i++)
			values[i] = i+1;
	}
	
	public void setStrategy(IProcessable entity){
		this.externalEntity = entity;
	}
	
	public int processData(){
		if(externalEntity != null)
			return externalEntity.processData(values);
		else
			throw new UnsupportedOperationException();
	}
}
