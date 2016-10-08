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
        char oper;
        float op2 = 0;
        float op1 = 0;
        Requisicao r;
        Resposta resp = null;
        try {
            
            Calculadora c
                    = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculatorService");
            do{
            oper = JOptionPane.showInputDialog("Digite a operação desejada ou S para sair:").charAt(0);
            if(oper == 's'){
              break;
            }
            op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Primeiro operando:"));
            op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo operando:"));
            

            r = new Requisicao(op1, op2);
//            resp = new Resposta();
            
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
            
            }while(oper!='s');        
//            System.out.println(c.sub(4, 3));
//            System.out.println(c.add(4, 5));
//            System.out.println(c.mul(3, 6));
//            System.out.println(c.div(3, 0));
              
              if(op1 == 0 && op2 == 0 && resp == null){
               System.out.println("Nenhuma operação realizada.");
              }else{

              
              System.out.println("O resultado para a Operacao: "+op1+" " + oper + " " + op2 + " =");
              if(resp.getStatus() != 1){
                System.out.println(resp.getResult());
              }else{
               System.out.println("Operação nao Realizada. Divisão Por ZERO!!!");
              }
              }
              
             

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
