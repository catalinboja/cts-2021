package ro.ase.cts;

public class SumEntity implements IProcessable{

	@Override
	public int processData(int[] values) {
		if(values == null)
			return 0;
		int sum = 0;
		for(int i=0;i<values.length;i++)
			sum+=values[i];
		return sum;
	}

}
