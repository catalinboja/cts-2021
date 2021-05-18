package ro.ase.csie.cts.g1094.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class SavesHistory {
	List<SuperHeroMemento> autosaves = new ArrayList<>();
	
	public void addAutoSave(SuperHeroMemento savedImage) {
		this.autosaves.add(savedImage);
	}
	
	public SuperHeroMemento getAutoSave(int index) {
		if(index < 0 || index >= autosaves.size())
			throw new UnsupportedOperationException();
		else
		{
			SuperHeroMemento memento = this.autosaves.get(index);
			this.autosaves.remove(index);
			return memento;
		}
	}
}
