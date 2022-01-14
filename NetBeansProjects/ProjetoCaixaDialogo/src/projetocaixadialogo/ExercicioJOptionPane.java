package projetocaixadialogo;

import javax.swing.JOptionPane;

public class ExercicioJOptionPane {
    
    public static void main(String[] args) {
        
        String nomeC, nomeA;
        int anoI;
        
        nomeC = JOptionPane.showInputDialog("Informe o nome do seu curso: ");
        nomeA = JOptionPane.showInputDialog("Informe o nome do seu curso: ");
        anoI = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de inicio: "));
        
        JOptionPane.showMessageDialog(null, "Nome do curso: " + nomeC + "\n"
                          + "Nome do Aluno: " + nomeA  + "\n"
                          + "Ano de inicio: " + anoI + JOptionPane.INFORMATION_MESSAGE);
            
       
        
    }

}
