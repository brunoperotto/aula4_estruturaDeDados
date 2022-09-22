/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoraaula4_bruno;

/**
 *
 * @author bperotto
 */
public class CalculadoraAula4_bruno {

    public static void main(String[] args) {
        
        int valor1, valor2, resposta; /* Declarando variáveis */
        
        operacoes calc = new operacoes(); /*instanciando objeto */
        
        valor1 = calc.lerValor();
        valor2 = calc.lerValor();
        
        resposta = calc.soma(valor1, valor2);
        calc.imprime(valor1, valor2, resposta);
        
        resposta = calc.mult(valor1, valor2);
        calc.imprime(valor1, valor2, resposta);
        
        resposta = calc.sub(valor1, valor2);
        calc.imprime(valor1, valor2, resposta);
        
        resposta = calc.div(valor1, valor2);
        calc.imprime(valor1, valor2, resposta);
    }
}
