/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author felipe
 */
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora{
    
    
    public CalculadoraImpl() throws RemoteException{
       super();    
    }

    @Override
    public long add(long a, long b) throws RemoteException {
       
      return a+b;
    }

    @Override
    public long sub(long a, long b) throws RemoteException {
       
      return a-b;
    }

    @Override
    public long mul(long a, long b) throws RemoteException {
    
      return a*b;
    }

    @Override
    public long div(long a, long b) throws RemoteException {
      
      return a/b;
    }
    
}
