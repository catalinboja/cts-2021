package ro.ase.cts;

// Memento

public class TextMemento {
    private final String text;
    
    public TextMemento(String textDeSalvat) {
    	text = textDeSalvat;
    }

    public String getVersionContent() {
        return text;
    }
}
