package ro.asee.csie.cts.g1093.dp.command;

public class AsyncTask implements AsyncTaskInterface{
	
	GameModuleInterface module;
	String actionDetails;
	int priority;
	
	
	public AsyncTask(GameModuleInterface module, String actionDetails, int priority) {
		super();
		this.module = module;
		this.actionDetails = actionDetails;
		this.priority = priority;
	}


	@Override
	public void startTask() {
		this.module.doTheTask(actionDetails);
	}

}
