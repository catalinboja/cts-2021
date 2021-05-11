package ro.ase.csie.cts.g1094.dp.command;

public class UpdateModule implements GameModuleInterface{

	@Override
	public void doTask(String taskName) {
		System.out.println("Updating: " + taskName);
	}

}
