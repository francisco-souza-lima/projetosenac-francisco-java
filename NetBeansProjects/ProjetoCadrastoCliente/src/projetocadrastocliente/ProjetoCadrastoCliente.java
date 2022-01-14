package projetocadrastocliente;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class ProjetoCadrastoCliente {

    public static void main(String[] args) {
        
        //Utilizando caixas de dialogo, sera feito um cadastro
        //de clientes com nome, endereço, cidade, cpf, data de nasc
        //e salario
        
        String nome, end, cid, cpf ;
        float sal;
        int idade;
        
        //solicitacao e captura de dados
        
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        end = JOptionPane.showInputDialog("Informe seu endereço: ");
        cid = JOptionPane.showInputDialog("Informe sua cidade: ");
        cpf = JOptionPane.showInputDialog("Informe seu cpf ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento: "));
        sal = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario: "));
        
        //Calculo da idade
        
        GregorianCalendar hoje = new GregorianCalendar();
        
        //o get serve para OBTER algo, neste caso, o ano corrente
        idade = hoje.get(GregorianCalendar.YEAR)-idade;
        
        // printar info
        // formatar sal - decimalFormat
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + nome + "\n" + "Endereço do cliente: " + end + "\n" 
                + "Cidade do cliente: " + cid + "\n" + "Cpf do cliente: " + cpf + "\n" + "idade cliente: " + idade 
                + "\n" + "Salario do cliente: R$ " + df.format(sal) + JOptionPane.DEFAULT_OPTION);
        
    }
    
}