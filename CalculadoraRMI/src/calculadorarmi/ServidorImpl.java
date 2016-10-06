package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject – Objeto Remoto Unicast

public class ServidorImpl extends UnicastRemoteObject implements Servidor{

	// todas as classes remotas (servidores) herdam UnicastRemoteObject e implementam a interface definida
	public ServidorImpl() throws RemoteException {
		// construtor – necessito chamar o construtor da superclasse
		super(); 
	}
	
	public String montaMensagem(String str) throws RemoteException {		
		return "Montagem: "+str.toString();
	}
}