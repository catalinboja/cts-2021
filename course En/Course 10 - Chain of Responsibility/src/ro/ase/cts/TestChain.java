package ro.ase.cts;

public class TestChain {
	public static void main(String[] args){
		Handler mp = new MessageProcessor();
		Handler highp = new HighPriorityProcessor();
		Handler maxp = new MaximumPriorityProcessor();
		Handler firep = new FireAlarmProcessor();
		
		maxp.setSuccessor(highp);
	
		highp.setSuccessor(mp);
		firep.setSuccessor(maxp);
		
		Message m1 = new Message("Fire alarm !",200);
		Message m2 = new Message("Open door at office 302 !",50);
		Message m3 = new Message("Security test !",78);
		
		firep.manageRequest(m1);
		firep.manageRequest(m2);
		firep.manageRequest(m3);
		
	}
}
