package ro.ase.cts;

public class AverageEntity implements IProcessable{

	@Override
	public int processData(int[] values) {
		if(values == null)
			return 0;
		int average = 0;
		for(int i=0;i<values.length;i++)
			average+=values[i];
		return average/values.length;
	}

}
