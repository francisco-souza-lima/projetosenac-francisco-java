package projetocadrastocliente;

import javax.swing.JOptionPane;

public class ProjetoDiaSemana {

    public static void main(String[] args) {
        
        String diaS = JOptionPane.showInputDialog("Diga um valor inteiro entre 1 e 7: ");
        
        if (diaS != null) {
            
            int dia = Integer.parseInt(diaS);
            
            if (dia == 1){
                
                diaS = "Domingo";
            }
            else if (dia == 2){
                
                diaS = "Segunda";
            }
            else if (dia == 3){
                
                diaS = "Terça";
            }
            else if (dia == 4){
                
                diaS = "Quarta";
            }
            else if (dia == 5){
                
                diaS = "Quinta";
            }
            else if (dia == 6){
                
                diaS = "Sexta";
            }
            else if (dia == 7){
                
                diaS = "Sabado";
            }
            else {
                
                diaS = "Dia da semana desconhecido";
            }
            
            JOptionPane.showMessageDialog(null, diaS);
            
        
        }
        
        
    }
    
}
