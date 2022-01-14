package operacoes;

import javax.swing.JOptionPane;

public class Operacoes {

    public static void main(String[] args) {
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
        
        String operacao = "", saida = "", saidaIP = "";
        
        operacao += "Escolha o numero para a realizar a operacao: \n" ;
        operacao += " 1 - Soma \n";
        operacao += " 2 - subtração \n";
        operacao += " 3 - multiplicação \n";
        operacao += " 4 - divisão \n";
        operacao += " 5 - par ou impar \n";

        JOptionPane.showMessageDialog(null, operacao);
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(operacao));
        
        if (op == 1) {
            
            saida = "A soma de N1: " + n1 + " + N2: " + n2 + " = " + (n1 + n2);
        }
        else if (op == 2) {
            
            saida = "A subtração de N1: " + n1 + " - N2: " + n2 + " = " + (n1 - n2);
        }
        else if (op == 3) {
            
            saida = "A multiplicação de N1: " + n1 + " * N2: " + n2 + " = " + (n1 * n2);
        }
        else if (op == 4) {
            
            while (n2 == 0) {
            
            JOptionPane.showMessageDialog(null, "Digite um numero valido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            n2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
        }
                        
            saida = "A divisão de N1: " + n1 + " / N2: " + n2 + " = " + (n1 / n2);
        }
        else if (op == 5) {
            
            if (n1 % 2 == 0) {
                
                saida = "O valor N1 é PAR";
            }
            else {
                
                saida = "O valor N1 é IMPAR";
            }
        }
        else {
            
            while (op > 5 || op < 1 ) {
                JOptionPane.showMessageDialog(null, "Digite uma opção valida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                op = Integer.parseInt(JOptionPane.showInputDialog(operacao));
            }
        }
        
        JOptionPane.showMessageDialog(null, saida , "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
    }
    
}
