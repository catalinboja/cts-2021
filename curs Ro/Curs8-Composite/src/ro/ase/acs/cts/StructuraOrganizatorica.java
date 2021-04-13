package ro.ase.acs.cts;

import java.util.ArrayList;

public class StructuraOrganizatorica extends NodStructuraIerarhica{

	ArrayList<NodStructuraIerarhica> elementeStructura = new ArrayList();
	String numeStructura;
	String descriere;
	
	public StructuraOrganizatorica(String numeStructura, String descriere){
		this.numeStructura = numeStructura;
		this.descriere = descriere;
	}
	
	@Override
	public String getNume() {
		return this.numeStructura;
	}

	@Override
	public String getPost() {
		throw new UnsupportedOperationException();
	}

	@Override
	public double getSalariu() {
		float fondSalarii = 0 ;
		for(NodStructuraIerarhica nod : this.elementeStructura) {
			fondSalarii += nod.getSalariu();
		}
		return fondSalarii;
	}
	
	@Override
	public String getInfo(){
		StringBuffer sb = new StringBuffer();
		sb.append(numeStructura + " - "+ this.descriere);
		sb.append("\n");
		
		for(NodStructuraIerarhica nod : elementeStructura)
			sb.append("\t" + nod.getInfo());
		
		return sb.toString();
		
	}
	
	@Override
	public void adaugaNodCopil(NodStructuraIerarhica elementStructura){
		elementeStructura.add(elementStructura);
	}
	
	@Override
	public void stergeNodCopil(NodStructuraIerarhica elementStructura){
		elementeStructura.remove(elementStructura);
	}
	
	@Override
	public NodStructuraIerarhica getNodCopil(int i){
		return (NodStructuraIerarhica)elementeStructura.get(i);
	}

}
