/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetormatriz_bruno;

/**
 *
 * @author bperotto
 */
public class Vetormatriz_bruno {

    public static void main(String[] args) {
       
        int x[] = new int[10];

        for(int i=0;i<10;i++){
            x[i] = 2*i;
            System.out.println("O valor da posição "+i+" é: "+x[i]);
        }
    }
}
