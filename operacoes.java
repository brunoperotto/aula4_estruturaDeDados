/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraaula4_bruno;

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */

public class operacoes {
    
    int lerValor(){
        String n;
        n = JOptionPane.showInputDialog("Entre com o valor para calcular: ");
        return(Integer.parseInt(n));
    }

    int soma(int a, int b){
        return(a+b);
    }
    
    int mult(int a, int b){
        return(a*b);
    }
    
    int sub(int a, int b){
        return(a-b);
    }
    
    int div(int a, int b){
        return((int)a/b);
    }
    
    void imprime(int v1, int v2, int resp){
        System.out.println("Os valores são "+v1+" e "+v2);
        System.out.println("O resultado da operação é: "+resp);
    }

    
}
