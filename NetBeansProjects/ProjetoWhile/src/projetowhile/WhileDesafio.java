package projetowhile;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class WhileDesafio {

    public static void main(String[] args) {
        
        int idade, c;
        String nome, cid; 
        
        c = 1;

        while (c <= 3) {

            nome = JOptionPane.showInputDialog("Nome: ");
            cid = JOptionPane.showInputDialog("Cidade: ");
            
            int anoN = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
             
            GregorianCalendar ano = new GregorianCalendar();
            idade = ano.get(GregorianCalendar.YEAR) - anoN;
            
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
                    + "Cidade: " + cid + "\n" + "Data de Nascimento: " + anoN +
                    "\n" + "Idade: " + idade + " anos");
            
            c++;        
        }
    }
}