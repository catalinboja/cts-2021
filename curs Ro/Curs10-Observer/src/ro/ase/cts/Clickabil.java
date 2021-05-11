package ro.ase.cts;

import java.util.ArrayList;

public abstract class Clickabil {
	//colectie observatori 
	ArrayList<HandlerClick> observatori = new ArrayList<HandlerClick>();
	
	public void abonareHandler(HandlerClick handler){
		if(observatori!=null)
			observatori.add(handler);
	}
	public void dezabonareHandler(HandlerClick handler){
		if(observatori!=null)
			observatori.remove(handler);
	}
	public void notificareObservatori(){
		if(observatori!=null)
			for(int i = 0;i<observatori.size();i++)
				observatori.get(i).doClick();
	}
	
}
