package ro.ase.csie.cts.g1088.dp.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerTaskuri {
	
	List<InterfataTaskAsincron> taskuri = new ArrayList<>();
	
	public void adaugaTask(InterfataTaskAsincron task) {
		taskuri.add(task);
	}
	
	public void executaUrmatorulTask() {
		if(taskuri.size() > 0 ) {
			InterfataTaskAsincron task = taskuri.get(0);
			task.startTaskAsincron();
			taskuri.remove(0);
		}
	}
}
