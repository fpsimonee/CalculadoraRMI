/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.Naming;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class CalculadoraCliente {

    public static void main(String[] args) {
        try {
            Calculadora c
                    = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculatorService");

            float op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Primeiro operando:"));
            float op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo operando:"));
            char oper = JOptionPane.showInputDialog("Digite a operação desejada:").charAt(0);

            Requisicao r = new Requisicao(op1, op2);
            Resposta resp = new Resposta();
            switch (oper) {
                case '+':
                    resp = c.add(r);
                    break;
                case '-':
                    resp = c.sub(r);
                    break;
                case '*': 
                    resp = c.mul(r);
                    break;    
                case '/': 
                    resp = c.div(r);
                    break;
                default: 
                    resp.setStatus(1);
                    break;
            }

//            System.out.println(c.sub(4, 3));
//            System.out.println(c.add(4, 5));
//            System.out.println(c.mul(3, 6));
//            System.out.println(c.div(3, 0));

              System.out.println("O resultado para a Operacao: "+op1+" " + oper + " " + op2 + " =");
              if(resp.getStatus() != 1){
                System.out.println(resp.getResult());
              }else{
               System.out.println("Operação nao Realizada. Divisão Por ZERO!!!");
              }
             

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
