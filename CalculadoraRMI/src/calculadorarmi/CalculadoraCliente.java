/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.Naming;

/**
 *
 * @author felipe
 */
public class CalculadoraCliente {

    public static void main(String[] args) {
        try {
            Calculadora c
                    = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculatorService");
            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 5));
            System.out.println(c.mul(3, 6));
            System.out.println(c.div(9, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
