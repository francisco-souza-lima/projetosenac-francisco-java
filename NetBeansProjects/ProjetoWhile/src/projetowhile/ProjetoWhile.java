package projetowhile;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoWhile {

    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        //Trabalhando com a estrutura repetição While - Enquanto
        
        int n1, n2, soma, contador;
        
        contador = 0;

        while (contador <= 3) {

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2: "));
            
            soma = n1 + n2;
            
            JOptionPane.showMessageDialog(null, "Resultado da Soma: " + soma);
            
            contador++;
        }

    }

}
