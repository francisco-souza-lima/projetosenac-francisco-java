package projetoidade;

import javax.swing.JOptionPane;

public class ProjetoIdade {


    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        
        if (idade >= 15 && idade < 18) {
            
            nome = "Entrada só com os pais";
        }
        else if (idade >= 18) {
            
            nome = "Entrada Liberada!";
        }
        else {
            
            nome = "Entrada Proibida! menor de 15 anos";
        }
        
        JOptionPane.showMessageDialog(null, nome, "Ultimato", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}