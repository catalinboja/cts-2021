package ro.ase.cts.adaptor.classes;

public class PrinterAdapter extends OldJetPrinter implements LaserPrinterInterface{

	@Override
	public void laserPrint(String[] paragraphs) {
		this.print(paragraph2Text(paragraphs));
	}

	@Override
	public void cancelPrint() {
		this.cancel();
	}
	
	public String paragraph2Text(String[] paragraphs){
		StringBuilder sb = new StringBuilder();
		for(String paragraph : paragraphs)
			sb.append(" "+paragraph);
		return sb.toString();
	}

}
