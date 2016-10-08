package calculadorarmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kakugawa
 */
public class Requisicao implements java.io.Serializable {

    private float op1;
    private float op2;
//    private char operacao;

    public Requisicao(float op1, float op2) {
        this.op1 = op1;
        this.op2 = op2;
//        this.operacao = operacao;
    }

    public float getOp1() {
        return op1;
    }

    public float getOp2() {
        return op2;
    }

//    public char getOperacao() {
//        return operacao;
//    }
}
