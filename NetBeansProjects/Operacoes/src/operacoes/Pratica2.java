package operacoes;

import javax.swing.JOptionPane;

public class Pratica2 {
    
    public static void main(String[] args) {
    
        //Escreva um progama que solicite ao usuario 2 numeros
        //ponto flutuante (double) 
        //calcule e mostre:
        //Raiz Quadrada do N1 =
        //N1 elevado a N2 =
        
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("N1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("N2: "));
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("1 - Raiz Quadrada do N1 \n" 
                + "2 - N1 elevado a N2 "));
        
        while (a != 1 && a != 2) {
            
            a = Integer.parseInt(JOptionPane.showInputDialog("1 - Raiz Quadrada do N1 \n"
                + "2 - N1 elevado a N2 "));
        }
        
        if (a == 1) {
            
            JOptionPane.showMessageDialog(null, "Raiz Quadrada do N1 = " + Math.sqrt(n1), 
                    "Resultados", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (a == 2) {
            
            JOptionPane.showMessageDialog(null, "N1 elevado a N2 = " + Math.pow(n1, n2), 
                    "Resultados", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}