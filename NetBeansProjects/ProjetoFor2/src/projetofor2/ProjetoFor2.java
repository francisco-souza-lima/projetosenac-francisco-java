/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofor2;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.eslima1
 */
public class ProjetoFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da tabuada: " ));
//        
//        for (int i = 1; i <= 10; i++) {
//            
//            System.out.println(numero + " x " + i + " = " + (numero * i));
//            
//        }

        int horas, minutos, segundos;
        
        for (horas = 0; horas < 24; horas++) {
            
            for (minutos = 0; minutos < 60; minutos++) {
                
                for (segundos = 0; segundos < 60; segundos++) {
                    
                    System.out.println(horas);
                    
                }
                
            }
            
        }
        
        
    }
    
}
