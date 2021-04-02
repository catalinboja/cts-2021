package ro.ase.csie.cts.g1094.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable {
	
	String color;
	int height;
	
	ArrayList<Integer> points = new ArrayList<>();
	
	public Tree3DModel(String color, int height) {
		this.color = color;
		this.height = height;
		
		System.out.println("Loading the 3D model ...");
		try {
			Thread.sleep(2000);
			Random random = new Random(1000);
			for(int i = 0; i < 20; i++) {
				this.points.add(random.nextInt(100));
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Model loaded.");
		
	}
	
	private Tree3DModel() {

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Tree3DModel copy = new Tree3DModel();
		copy.color = this.color;
		copy.height = this.height;
		copy.points = (ArrayList<Integer>) this.points.clone();
		
		return copy;
	}
	
	
	
	
}
