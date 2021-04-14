package ro.ase.csie.cts.g1087.dp.adapter;

public interface ActiuniDisney {
	
	public String getNume();
	public int getPower();
	
	public void move(int x, int y);
	public void primesteLovitura(int power);
	public void reincarca(int power);
	public void jump();
	
}
