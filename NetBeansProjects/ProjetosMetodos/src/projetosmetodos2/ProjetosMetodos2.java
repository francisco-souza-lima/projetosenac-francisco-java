package projetosmetodos2;

import javax.swing.JOptionPane;

public class ProjetosMetodos2 {

    public static void main(String[] args) {

        operacoes op = new operacoes();

        String nome = JOptionPane.showInputDialog("Nome: ");
        String sN = JOptionPane.showInputDialog("Sobrenome: ");
        JOptionPane.showMessageDialog(null, op.exibirNomes(nome, sN));

        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero x, e lhe direi seu valor ao quadrado!"));
        JOptionPane.showMessageDialog(null, String.format("%.2f", op.valorQuadrado(x)));

        do {
            JOptionPane.showMessageDialog(null, "Numero aleatorio de 0-10: \n" + op.sorteio());
            
        } while (JOptionPane.showConfirmDialog(null, "Quer mais um numero aleatorio? ", "VAI OU RACHA?", JOptionPane.YES_OPTION)== 0);
        
    
    }

}
