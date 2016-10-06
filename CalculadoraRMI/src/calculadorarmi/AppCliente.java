package calculadorarmi;

import java.rmi.*;

public class AppCliente {
	public static void main(String args[]) {
		try {
			// acesso o Binder pelo nome que fora registrado
			Servidor m = (Servidor) Naming.lookup("rmi://localhost:1099/Servidor");
			// método utilizado normalmente
			System.out.println(m.montaMensagem("Ola!"));
    	} catch (Exception e) {
      		System.out.println("GenericException: " + e.toString());
    	}
	}
}