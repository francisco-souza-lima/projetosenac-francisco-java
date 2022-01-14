package projetoswitch1;

import javax.swing.JOptionPane;

public class ProjetoSwitch1 {

    public static void main(String[] args) {
        
        // Switch Case 

        String cores;
        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n"
                + "1 - Verde \n" + "2 - Preto"));
        
        // atalho switch case -> digitar sw e dar tab
        
        switch (op) {
            case 1:
                
                JOptionPane.showMessageDialog(null, "Voce Escolheu Verde!! ");
                
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Voce Escolheu Preto!! ");
            
            default:

                JOptionPane.showMessageDialog(null, "Escolha uma opção valida!");
        }
        
    }
    
}
