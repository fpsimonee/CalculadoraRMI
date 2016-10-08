package calculadorarmi;

import java.rmi.*; // importa pacotes do RMI
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraServidor {

    public CalculadoraServidor() {
        String rmiServerName ="//localhost/CalculatorService";
        
        
        try {
            Registry r = LocateRegistry.createRegistry(1099);            
            Calculadora c = new CalculadoraImpl();
            Naming.rebind(rmiServerName, c);
//            System.out.println("Servidor startado com sucesso!");
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new CalculadoraServidor();
    }

}
