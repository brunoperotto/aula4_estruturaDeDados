/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula4_calcdivisaoresto_bruno;

/**
 *
 * @author bperotto
 */
public class Aula4_calcDivisaoResto_bruno {

    public static void main(String[] args) {
        
       numerosDiv num = new numerosDiv(); //instanciado o objeto
       
       num.dividendo = 100;
       num.divisor = 33;
       
       num.cociente = num.div(num.dividendo, num.divisor);
       num.resto = num.mod(num.dividendo, num.divisor);
       num.imprime();
        
    }
}
