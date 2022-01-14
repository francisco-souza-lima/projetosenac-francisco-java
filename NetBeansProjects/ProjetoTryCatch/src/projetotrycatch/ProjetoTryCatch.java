package projetotrycatch;

import javax.swing.JOptionPane;

public class ProjetoTryCatch {

    public static void main(String[] args) {

        try {
            
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do numero 1: ");

            if (aux1 == null) {

                System.exit(0);
            }

            String aux2 = JOptionPane.showInputDialog("Forneça o valor do numero 2: ");

            if (aux2 == null) {

                System.exit(0);
            }

            int num1 = Integer.parseInt(aux1);
            int num2 = Integer.parseInt(aux2);

            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));

        }
        catch (ArithmeticException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro de divisao por zero! \n"
                    + erro.toString());
            
        }
        catch (NumberFormatException erro){
            
            JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros! \n"
                    + erro.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        System.exit(0);
 
    }
    
}