package ro.ase.csie.cts.g1093.dp.state;

public class CriticalWoundedState implements MoveStateInterface{

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero can't move");
	}

}
