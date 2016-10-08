/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

/**
 *
 * @author felipe
 */
public interface Calculadora extends java.rmi.Remote {

    public Resposta add(Requisicao r)
            throws java.rmi.RemoteException;

    public Resposta sub(Requisicao r)
            throws java.rmi.RemoteException;

    public Resposta mul(Requisicao r)
            throws java.rmi.RemoteException;

    public Resposta div(Requisicao r) 
            throws java.rmi.RemoteException;
}
