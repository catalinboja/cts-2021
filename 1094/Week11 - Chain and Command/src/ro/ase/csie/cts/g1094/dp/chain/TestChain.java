package ro.ase.csie.cts.g1094.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		ChatHandler languageFilter = new LanguageFilter("English");
		ChatHandler privateChat = new PrivateChat();
		ChatHandler globalChat = new GlobalChat();
		
		languageFilter.setNext(privateChat);
		privateChat.setNext(globalChat);
		
		ChatHandler chatServer = languageFilter;
		
		chatServer.processMessage(new Message("@everyone","Kill Superman. It's a bot",10));
		chatServer.processMessage(new Message("@John", "Let's start level 2", 0));
		chatServer.processMessage(new Message("@everyone", "Let's join the party", 0));
		
		
	}

}
