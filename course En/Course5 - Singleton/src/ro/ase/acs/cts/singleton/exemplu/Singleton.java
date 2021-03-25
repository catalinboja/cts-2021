package ro.ase.acs.cts.singleton.exemplu;

import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton instance = null;
    
    static{
    	System.out.println("Before the class is loaded");
    }

    {
    	System.out.println("Before the constructor call");
    }
    
    private Singleton() throws Exception {
    	if(instance!=null)
    		throw new Exception("Singleton deja creat !");
    }

    public static synchronized Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton ();
        }
        return instance;
    }
    
    /*
     * For deserialization
     */
    private Object readResolve() throws Exception {
        return Singleton.getInstance();
    }

}

