package projetoparimpar;

import javax.swing.JOptionPane;

public class ProjetoParImpar {

    public static void main(String[] args) {
        
        //Programa que diz se um numero int é impar ou par
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        
        if (a % 2 == 0) {
            
            JOptionPane.showMessageDialog(null, "Par", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Impar", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}