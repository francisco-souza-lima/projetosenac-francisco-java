package pratica3media;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pratica3Media {

    public static void main(String[] args) {

        String aR = "";

        String nome = JOptionPane.showInputDialog("Nome do aluno: ");
        String mat = JOptionPane.showInputDialog("Materia: ");

        ArrayList<Double> lista = new ArrayList<>();

        double provax;

        for (int i = 1; i <= 4; i++) {

            provax = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova " + i + ": "));

            while (provax < 0 || provax > 10) {
                
                JOptionPane.showMessageDialog(null,"Digite um resultado válido!", "ERRO" , JOptionPane.ERROR_MESSAGE);
                provax = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova " + i + ": "));

            }

            lista.add(provax);

        }
        
        int media = 0;
        
        for (double a : lista) {
            
            media += a;
        }
        
        media = media / 4;

        if (media >= 7) {

            aR = "Aprovado";
        } else if (media > 4 || media < 7) {

            aR = "Em Recuperação";
        } else if (media <= 4) {

            aR = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Estado: " + aR + " em " + mat);

    }

}
