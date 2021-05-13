package ro.asee.csie.cts.g1093.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.setNext(privateModule);
		privateModule.setNext(groupModule);
		
		GenericMessageHandler chatServer = filterModule;
		
		chatServer.processMessage(new Message("Hello John", "@John", 1));
		chatServer.processMessage(new Message("I hate you", "@John", 1));
		chatServer.processMessage(new Message("Let's join the party", "@everyone", 1));
	}

}
