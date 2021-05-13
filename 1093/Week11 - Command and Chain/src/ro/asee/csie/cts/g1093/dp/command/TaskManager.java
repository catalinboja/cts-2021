package ro.asee.csie.cts.g1093.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	List<AsyncTaskInterface> tasks = new ArrayList<>();
	String name;
	
	public TaskManager(String name) {
		super();
		this.name = name;
	}
	
	public void addAsyncTask(AsyncTaskInterface task) {
		this.tasks.add(task);
	}
	
	public void doNextTask() {
		//determine the task with the biggest priority
		//...
		
		
		//round-robin approach
		if(tasks.size() > 0) {
			AsyncTaskInterface task = tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
	}
	
}
