package ro.ase.cts;

public class TestObserver {
	
	public static void main(String[] args){
	
	Button buton = new Button();
	
	HandlerA handlerA = new HandlerA();
	HandlerB handlerB = new HandlerB();
	
	buton.registerHandler(handlerA);
	buton.registerHandler(handlerB);
	
	buton.Click();
	
	System.out.println("-----------------------------");
	
	buton.setClicked();
	buton.unregisterHandler(handlerA);
	buton.registerHandler(new HandlerClick() {
		
		@Override
		public void doClick() {
			// TODO Auto-generated method stub
			System.out.println("A new action");
		}
	});
	
	buton.Click();
	
	}
}
