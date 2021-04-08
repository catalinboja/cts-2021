package ro.ase.cts.adaptor.objects;

import java.util.ArrayList;

public class TestAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// type A collection
		ArrayList<TypeAMsg> typeAMessages = new ArrayList<>();
		typeAMessages.add(new TypeAMsg());
		typeAMessages.add(new TypeAMsg());

		for (TypeAMsg mesaj : typeAMessages)
			mesaj.print();

		
		// type B collection
		ArrayList<TypeBMessage> typeBMessages = new ArrayList<>();
		typeBMessages.add(new TypeBMessage());
		typeBMessages.add(new TypeBMessage());

		for (TypeBMessage msg : typeBMessages)
			msg.display();

		
		
		// classic approach
		ArrayList<Object> genericMsgs = new ArrayList<>();
		genericMsgs.add(new TypeAMsg());
		genericMsgs.add(new TypeBMessage());

		for (Object msg : genericMsgs) {
			if (msg instanceof TypeAMsg) {
				((TypeAMsg) msg).print();
			} else if (msg instanceof TypeBMessage) {
				((TypeBMessage) msg).display();;
			}
		}

		
		
		System.out.println("******* TEST object adapter");
		
		TypeAMsg objA = new TypeAMsg();
		objA.setText("Hello Adapter !");
		objA.print();

		MsgAdapter adaptor2B = new MsgAdapter(objA);
		TypeBInterface objB = adaptor2B;
		objB.setText(new String[] { "Hello", "World" });
		objB.display();
		
		System.out.println("******* TEST adaptor for a collection");
		
		ArrayList<TypeBInterface> mesajeTipB_2 = new ArrayList<>();
		mesajeTipB_2.add(new TypeBMessage());
		mesajeTipB_2.add( new MsgAdapter(objA));
		
		for(TypeBInterface mesaj : mesajeTipB_2)
			mesaj.display();
		
	}

}
