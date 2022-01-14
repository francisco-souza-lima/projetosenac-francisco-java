package projetoconvertertexto;

import javax.swing.JOptionPane;

public class ProjetoConverterTexto {

    public static void main(String[] args) {

        //Utilizando Switch case, vamos converter textos para maiusculo
        //ou minusculo
        //
        String nome, estado, estadoC;

        nome = JOptionPane.showInputDialog("Informe seu Nome: ");
        estado = JOptionPane.showInputDialog("Informe o Estado: ");

        //Converteremos ou para maiusculo ou minusculo
        estadoC = estado.toLowerCase(); //toUpperCase maiusc.

        switch (estadoC) {
            case "sp":

                JOptionPane.showMessageDialog(null, "Estado de São Paulo.");
                break;
            
            case "rj":
                JOptionPane.showMessageDialog(null, "Estado do Rio de Janeiro");
                
                break;
            
            case "ac":
                JOptionPane.showMessageDialog(null, "Estado do Acre");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Demais Estados!");

        }

    }

}
