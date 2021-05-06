package ro.ase.cts;

public class Message {
		private int priority;
		private String text;

		public Message(String Text, int priority){
			this.text = Text;
			this.priority = priority;
		}

		public int getPriority(){
			return priority;
		}

		public String getText(){
			return text;
		}
}
