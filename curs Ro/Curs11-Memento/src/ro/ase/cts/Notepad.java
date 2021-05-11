package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;


// CareTaker

public class Notepad {
	private List<TextMemento> salvari = new ArrayList<TextMemento>();

	
	public void addSalvare(TextMemento salvare){
		this.salvari.add(salvare);
	}
	
	public TextMemento recupereazaUltimaSalvare(){
		if(salvari.size()!=0){
			TextMemento salvare =  salvari.get(salvari.size()-1);
			salvari.remove(salvari.size()-1);
			return salvare;
		}
		else
			return new TextMemento("");
	}
}
