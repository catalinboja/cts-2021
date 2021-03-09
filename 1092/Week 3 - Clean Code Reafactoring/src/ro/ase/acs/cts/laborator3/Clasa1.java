package ro.ase.acs.cts.laborator3;

public class Clasa1 {
	public float Calculeaza(int t, float s, int perioada)
	  {
	    float rezultat = 0;
	    float valoare = (perioada > 10) ? (float)15/100 : (float)perioada/100; 
	    if (t == 1)
	    {
	      rezultat = s;
	    }
	    else if (t == 2)
	    {
	      rezultat = (s - (0.1f * s)) - valoare * (s - (0.1f * s));
	    }
	    else if (t == 3)
	    {
	      rezultat = (s - (0.25f * s)) - valoare * (s - (0.25f * s));
	    }
	    else if (t == 4)
	    {
	      rezultat = (s - (0.35f * s)) - valoare * (s - (0.35f * s));
	    }
	    return rezultat;
	  }
}