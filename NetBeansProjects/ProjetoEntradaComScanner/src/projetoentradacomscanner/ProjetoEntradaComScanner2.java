package projetoentradacomscanner;

import java.util.Scanner;

public class ProjetoEntradaComScanner2 {
    
    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
//        Crie um sistema que vai ler e receber os dados: nome(String), 
//        telefone(String) e ano de nascimento (int).
//        vamos calcular a idade da pessoa e exibir as informaçoes
        
        System.out.println("Digite seus dados: ");
        System.out.print("Nome: ");
        String nome = oracle.nextLine();
        
        System.out.print("Telefone: ");
        String tel = oracle.nextLine();
               
        System.out.print("Ano de Nascimento: ");
        int anoNas = oracle.nextInt();
        
        int idade =  2021 - anoNas;
        
        System.out.println();
        
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + tel);
        System.out.println("Idade: " + idade + " anos");
    }

}
