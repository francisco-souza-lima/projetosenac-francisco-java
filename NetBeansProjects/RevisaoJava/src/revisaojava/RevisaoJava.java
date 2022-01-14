package revisaojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class RevisaoJava {

    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        // Exercicio 1: 
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Me diga quantos numeros"));
//
//        int cont = 1;
//        while (cont <= n) {
//
//            int nX = Integer.parseInt(JOptionPane.showInputDialog("Diga um Numero Inteiro x"));
//
//            if (nX < 0) {
//
//                JOptionPane.showMessageDialog(null, "Numero Negativo!");
//            } else {
//
//                JOptionPane.showMessageDialog(null, "Numero Positivo!");
//            }
//            
//            cont++;
//        }
        // Exercicio 2
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Me diga quantos numeros"));
//        
//        
//        int cont = 1;
//        while (cont <= n) {
//
//            double nX = Double.parseDouble(JOptionPane.showInputDialog("Diga um Numero Inteiro x"));
//
//            if (nX % 7 == 0) {
//
//                JOptionPane.showMessageDialog(null, "Numero Multiplo de 7!");
//            } else {
//
//                JOptionPane.showMessageDialog(null, "Numero Não Multiplo de 7!");
//            }
//
//            cont++;
//        }
        // Exercicio 3
//        int cont = 1;
//        while (cont <= 4) {
//            
//            String cli = "";
//            
//            String nome = JOptionPane.showInputDialog("Nome:");
//            String end = JOptionPane.showInputDialog("Endereço:");
//            String cid = JOptionPane.showInputDialog("Cidade:");
//            String est = JOptionPane.showInputDialog("Estado:");
//            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
//            int tel = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
//            String sex = JOptionPane.showInputDialog("Sexo:");
//            
//            cli += "Nome: " + nome + "\n"
//                    + "Endereço: " + end + "\n"
//                    + "Cidade: " + cid + "\n"
//                    + "Estado: " + est + "\n"
//                    + "Idade: " + idade + "\n"
//                    + "Telefone: " + tel + "\n"
//                    + "Sexo: " + sex + "\n";
//            
//            JOptionPane.showMessageDialog(null, cli);
//            
//            if (idade >= 60) {
//                
//                JOptionPane.showMessageDialog(null, "Idade Menor ou Igual a 60 Anos \n - Dar desconto de 5% -");
//            }
//
//            cont++;
//        }
        // Exercicio 4
//        int cont = 1;
//        while (cont <= 4) {
//
//            double sal = Double.parseDouble(JOptionPane.showInputDialog("Salário " + cont + ": "));
//            double bonus = Double.parseDouble(JOptionPane.showInputDialog("Bônus Salarial " + cont + ": "));
//
//            double salTotal = sal + bonus;
//            
//            if (salTotal >= 2500) {
//
//                JOptionPane.showMessageDialog(null, "Parabéns, você receberá o salário total de: R$ " + salTotal);
//            } else {
//                
//                JOptionPane.showMessageDialog(null, "Você receberá o salário total de: R$ " + salTotal);
//            }
//            
//            cont++;
//
//        }

        // Exercicio 5

//        int cont = 1;
//        while (cont <= 5) {
//
//            String nome = JOptionPane.showInputDialog("Nome:");
//            String curso = JOptionPane.showInputDialog("Curso:");
//            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1: "));
//            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2: "));
//            int nT = Integer.parseInt(JOptionPane.showInputDialog("Nota Trabalho: "));
//
//            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"
//                    + "Curso: " + curso + "\n" + "Calculo: '(Nota1+Nota2)*NotaTrabalho' " + (n1+n2)*nT);
//            
//        }
//        
//        cont++;

        System.out.println("[1] – LEITE – R$8,00 \n"
                + "[2] – BOLO – R$5,00 \n"
                + "[3] – ACHOCOLATADO – R$4,50 \n"
                + "[4] – PÃO – R$3,80");
        
        int n = oracle.nextInt();
        
        switch (n) {
            
            case 1:
                
                System.out.print("Qual a quantidade de leite que deseja comprar?: ");
                n = oracle.nextInt();
                
                System.out.println("Total: R$ " + 8.00*n);
                
                break;
            case 2:
                
                System.out.print("Qual a quantidade de bolo que deseja comprar?: ");
                n = oracle.nextInt();
                
                System.out.println("Total: R$ " + 5.00*n);
                
                break;
            case 3:
                
                System.out.print("Qual a quantidade de achocolatado que deseja comprar?: ");
                n = oracle.nextInt();
                
                System.out.println("Total: R$ " + 4.50*n);
                
                break;
            case 4:
                
                System.out.print("Qual a quantidade que de pao deseja comprar?: ");
                n = oracle.nextInt();
                
                System.out.println("Total: R$ " + 3.80*n);
                
                break;
            default:
                System.out.println("");
                System.out.println("Digite uma opção válida! ");
                
                n = oracle.nextInt();
                
        }
    }
}