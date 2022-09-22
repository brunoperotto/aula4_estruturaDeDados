/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alunos_brunoaula4;

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */
public class Alunos_brunoAula4 {

    public static void main(String[] args) {
        
        float notas[] = new float[4];
        String nome, n;
        float media, soma = 0;
        
        nome = JOptionPane.showInputDialog("Insira o nome: ");
        
        for(int i=0; i<4; i++){
            n = JOptionPane.showInputDialog("Entre com a nota "+(i+1)+" do aluno: ");
            notas[i] = Float.parseFloat(n);
            System.out.println("A nota "+(i+1)+"do aluno foi: "+notas[i]);
        }
        
        for(int i=0; i<4; i++){
            soma = soma + notas[i];
        }
        
        media = soma/4;
            
            System.out.println("Média do aluno "+nome+" é: "+media);

        
    }
}
