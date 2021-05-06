package ro.ase.cts;

public class TestChain {
	public static void main(String[] args){
		MessageProcessor mp = new MessageProcessor();
		HighPriorityProcessor highp = new HighPriorityProcessor();
		MaximumPriorityProcessor maxp = new MaximumPriorityProcessor();
		
		maxp.setSuccessor(highp);
		highp.setSuccessor(mp);
		
		Message m1 = new Message("Fire alarm !",200);
		Message m2 = new Message("Open door at office 302 !",50);
		Message m3 = new Message("Security test !",78);
		
		maxp.manageRequest(m1);
		maxp.manageRequest(m2);
		maxp.manageRequest(m3);
		
	}
}
