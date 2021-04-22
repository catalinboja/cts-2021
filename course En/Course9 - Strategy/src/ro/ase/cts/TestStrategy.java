package ro.ase.cts;

public class TestStrategy {
	
	public static void main(String[] args){
	
		DataCollection colectie = new DataCollection(10);
	
		SumEntity sum = new SumEntity();
		AverageEntity average = new AverageEntity();
	
		//compute sum
		colectie.setStrategy(sum);
		System.out.println(
				"Result is "+colectie.processData());
		
		//compute average
		colectie.setStrategy(average);
		System.out.println(
				"Result is "+colectie.processData());
		
		//define a local strategy
		colectie.setStrategy(new IProcessable() {
			@Override
			public int processData(int[] valori) {
				return 0;
			}
		});
		System.out.println(
				"Result is "+colectie.processData());
	
	}
}
