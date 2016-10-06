package calculadorarmi;

import java.rmi.Naming;

public class AppServidor {

    public static void main(String[] args) {
    	try {
        	Servidor m = new ServidorImpl();
        	
        	// crio uma instancia do obj e registro no Binder
            Naming.rebind("rmi://localhost:1099/Servidor", m);
        } catch( Exception e ) {
        	System.out.println( "Trouble: " + e.getMessage() );
        }
    }
}