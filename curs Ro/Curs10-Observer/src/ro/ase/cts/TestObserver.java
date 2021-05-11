package ro.ase.cts;

public class TestObserver {
	
	public static void main(String[] args){
	
	Button buton = new Button();
	
	HandlerA handlerA = new HandlerA();
	HandlerB handlerB = new HandlerB();
	
	buton.abonareHandler(handlerA);
	buton.abonareHandler(handlerB);
	
	buton.Click();
	
	System.out.println("-----------------------------");
	
	buton.setClicked();
	buton.dezabonareHandler(handlerA);
	buton.abonareHandler(new HandlerClick() {
		
		@Override
		public void doClick() {
			// TODO Auto-generated method stub
			System.out.println("Ceva nou");
		}
	});
	
	buton.Click();
	
	}
}
