package pratica3media;

import javax.swing.JOptionPane;

public class DiaSemana {
    
    public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um num inteiro (1-7)"));
        
        String diaS = "";
        
        switch (dia) {
            
            case 1: diaS = "Domingo"; break;
            case 2: diaS = "Segunda-feira"; break;
            case 3: diaS = "Terça-feira"; break;
            case 4: diaS = "Quarta-feira"; break;
            case 5: diaS = "Quinta-feira"; break;
            case 6: diaS = "Sexta-feira"; break;
            case 7: diaS = "Sábado"; break;
            default: diaS = "Digite uma opção valida!"; 
            
        }
        
        JOptionPane.showMessageDialog(null, diaS);
        
    }
    
}
