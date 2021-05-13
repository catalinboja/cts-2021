package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;


// CareTaker

public class Notepad {
	private List<TextMemento> history = new ArrayList<TextMemento>();

	
	public void addSnapshot(TextMemento version){
		this.history.add(version);
	}
	
	public TextMemento recoverLastVersion(){
		if(history.size()!=0){
			TextMemento version =  history.get(history.size()-1);
			history.remove(history.size()-1);
			return version;
		}
		else
			return new TextMemento("");
	}
}
