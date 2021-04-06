package ro.ase.cts.adaptor.clase;

public class AdaptorImprimanta extends ImprimantaMatriceala implements InterfataImprimantaLaser{

	@Override
	public void laserPrint(String[] paragrafe) {
		this.print(paragraf2Text(paragrafe));
	}

	@Override
	public void cancelPrint() {
		this.cancel();
	}
	
	public String paragraf2Text(String[] paragrafe){
		StringBuilder sb = new StringBuilder();
		for(String paragraf : paragrafe)
			sb.append(" "+paragraf);
		return sb.toString();
	}

}
