/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetometodos;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.eslima1
 */
public class ProjetoMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        operacoes op = new operacoes();

//        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero  A"));
//        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero  B"));
//        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero  C"));
//
//        JOptionPane.showMessageDialog(null, "Media: " + String.format(" %.2f", op.media(a, b, c)));
//
//        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro e-lhe direi \n se ele é par ou impar"));
//
//        d = op.parImpar(d);        
//        String x = op.parImparTxt(d);
//
//        JOptionPane.showMessageDialog(null, x);
//        
        
        int val = Integer.parseInt(JOptionPane.showInputDialog("Diga 1 numero e dire os prox. 5 numeros: "));  
        JOptionPane.showMessageDialog(null, op.repeticaoNum(val));
    }

}
