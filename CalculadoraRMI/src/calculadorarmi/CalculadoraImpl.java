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
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public Resposta add(Requisicao r) throws RemoteException {
        Resposta resp = new Resposta();

        resp.setResult((r.getOp1()) + (r.getOp2()));
        resp.setStatus(0);
        return resp;

    }

    @Override
    public Resposta sub(Requisicao r) throws RemoteException {
        Resposta resp = new Resposta();

        resp.setResult((r.getOp1()) - (r.getOp2()));
        resp.setStatus(0);
        return resp;

    }

    @Override
    public Resposta mul(Requisicao r) throws RemoteException {
        Resposta resp = new Resposta();

        resp.setResult((r.getOp1()) * (r.getOp2()));
        resp.setStatus(0);
        return resp;

    }

    @Override
    public Resposta div(Requisicao r) throws RemoteException {
        Resposta resp = new Resposta();
        if (r.getOp2() == 0) {
            
            resp.setStatus(1);

        } else {

            resp.setResult((r.getOp1()) / (r.getOp2()));
            resp.setStatus(0);

        }
        return resp;
    }
}
