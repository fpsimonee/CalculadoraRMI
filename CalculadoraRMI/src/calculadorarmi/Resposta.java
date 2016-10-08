
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
public class Resposta implements java.io.Serializable {

    private int status;
    private float result;

    public Resposta(int status, float result) {
       this.status = status;
        this.result = result;
    }

    public Resposta() {
        // nao faz nada
    }

    public int getStatus() {
        return status;
    }

    public float getResult() {
        return result;
    }

    public void setStatus(int newstatus) {
        status = newstatus;
    }

    public void setResult(float newresult) {
        result = newresult;
    }
}