package projetocaixadialogo;

import javax.swing.JOptionPane;

public class ProjetoCaixaDialogo {

    public static void main(String[] args) {
        
        // Vamos trabalhar com caixas de dialogo JOptionPane
        
        String nome, cidade, uf;
        
        
        // vai solicitar e capturar as informacacoes de uma so vez!
        
        nome = JOptionPane.showInputDialog("Informe seu Nome: ");
        cidade = JOptionPane.showInputDialog("Informe cidade: ");
        uf = JOptionPane.showInputDialog("Informe a uf: ");
        
        // vai exibir as informacoes
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
                          + "Voce mora na cidade: " + cidade 
                          + " - UF: " + uf, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
        // PLAIN_MESSAGE = sem nenhum simbulo 
        
    }
    
}
