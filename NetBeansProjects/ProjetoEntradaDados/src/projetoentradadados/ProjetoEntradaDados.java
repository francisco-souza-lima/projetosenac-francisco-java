package projetoentradadados;

import java.util.Scanner;




public class ProjetoEntradaDados {
    
    public static void main(String[] args) {
        
        
//        Nesse projeto vamos trabalhar com a entrada de dados do
//        Usuario, usando a classe chamada SCANNER

        String nome;
        
//        Solicitar ao usuario que informe seu nome


        System.out.println("Informe seu nome completo.");
        
//        para trabalhar com a classe Scannner, deveremos chamar a classe

        Scanner oracle = new Scanner(System.in);
        
        nome = oracle.next();
    
        System.out.println("nome: " + nome);
            
    }
    
}
