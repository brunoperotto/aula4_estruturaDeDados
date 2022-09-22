/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alunos_matriznotas_aula4bruno;

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */
public class Alunos_matriznotas_aula4bruno {

    public static void main(String[] args) {
        
        String nome[] = new String[3];
        float dadosEscolares[][] = new float[3][6];
        String n;
        float soma = 0;
        
        lerNotas nt = new lerNotas();
        
        for(int i=0; i<3; i++){
            nome[i] = JOptionPane.showInputDialog("Insira o nome do primeiro aluno "+(i+1)+":");
            n = JOptionPane.showInputDialog("Insira o número da matrícula do "+nome[i]+":");
            dadosEscolares[i][0] = nt.converter(n);
            
            for(int j=1; j<5; j++){
                n = JOptionPane.showInputDialog("Insira a nota "+j+":");
                dadosEscolares[i][j] = nt.converter(n);
            }
            for(int j=1; j<5; j++){
                soma = soma+dadosEscolares[i][j];
                dadosEscolares[i][5] = soma/4;
            }
            soma = 0;
        }
        for(int i=0; i<3; i++){
            System.out.println("--------------------------------");
            System.out.println("Os dados do aluno "+nome[i]);
            System.out.println("O número da matrícula é: "+dadosEscolares[i][0]);
            
            for(int j=1; j<5; j++){
                System.out.println("O valor da nota "+j+" é: "+dadosEscolares[i][j]);
            }
            
            System.out.println("A média final foi: "+dadosEscolares[i][5]);
        }
    }
}
