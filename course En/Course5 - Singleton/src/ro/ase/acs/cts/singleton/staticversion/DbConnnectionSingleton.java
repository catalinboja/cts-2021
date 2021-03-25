package ro.ase.acs.cts.singleton.staticversion;


public class DbConnnectionSingleton {

    public static final DbConnnectionSingleton instance;
   
    static {
    	instance = 
        		new DbConnnectionSingleton();
    }
    
    private DbConnnectionSingleton() { }
}
