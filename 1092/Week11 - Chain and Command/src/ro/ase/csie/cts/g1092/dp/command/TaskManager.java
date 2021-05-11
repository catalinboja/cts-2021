package ro.ase.csie.cts.g1092.dp.command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<AsyncTask> tasks = new ArrayList<>();

	public void addAsyncTask(AsyncTask task) {
		tasks.add(task);
	}

	public void execute() {
		if (tasks.size() > 0) {
			AsyncTask taskToExecute = tasks.get(0);
			if (taskToExecute != null) {
				tasks.remove(0);
				taskToExecute.asyncExecute();
			}
		}
	}

}
