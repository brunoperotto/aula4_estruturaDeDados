/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunos_matriznotas_aula4bruno;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class lerNotas {
    
    float converter(String nota){
        return(Float.parseFloat(nota));
    }
    
    void creditos(){
        JOptionPane.showMessageDialog(null, "Desenvolvido por bperotto");
    }
    
    void suporte(){
        System.out.println("Contate o suporte!");
    }
    
}
