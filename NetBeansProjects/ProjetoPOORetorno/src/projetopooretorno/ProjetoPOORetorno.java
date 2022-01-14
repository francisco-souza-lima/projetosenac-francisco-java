package projetopooretorno; 

import javax.swing.JOptionPane;

public class ProjetoPOORetorno {
 
    public static void main(String[] args) {
        
        opretorno op = new opretorno();
        
        JOptionPane.showMessageDialog(null, "A soma dos valores: " + op.somar(53, 80));
        
        JOptionPane.showMessageDialog(null, "São pares: " + op.pares(46));
        
        JOptionPane.showMessageDialog(null, "Hoje é: " + op.diaPorExtenso(5));
        
        JOptionPane.showMessageDialog(null, "A qtd de letras A no nome: " + op.contarLetras("Ana Viana Machado"));
        
        
        
     }
    
    
}
