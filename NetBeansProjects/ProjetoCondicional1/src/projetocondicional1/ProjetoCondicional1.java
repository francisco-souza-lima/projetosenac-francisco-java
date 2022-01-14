package projetocondicional1;

import javax.swing.JOptionPane;

public class ProjetoCondicional1 {

    public static void main(String[] args) {
        
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        
        //condicoes valor >= 80 somar 10
        //valor < 80 subtrair 5
        
        if (valor >= 80){ //80 pra cima
            
            valor += + 10;
        }
        else { //79 pra baixo
            
            valor += - 5;
        }
        
        JOptionPane.showMessageDialog(null, valor, "Resultado: ", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
