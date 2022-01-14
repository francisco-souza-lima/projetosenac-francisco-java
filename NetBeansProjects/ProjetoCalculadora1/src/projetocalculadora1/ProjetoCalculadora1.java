package projetocalculadora1;
import java.util.Scanner;

public class ProjetoCalculadora1 {

    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        int variavelTop, aux;
        
        
//        Exercicio 1:

//        Receber 2 valores inteiros e solicitar ao usuario para que ele 
//        informe os valores, o sistema vai capturar os valores
//        e efetuar a soma, a multipl, a subtracao, e a divisao:
        
        System.out.print("Informe o valor de a: ");
        int a = oracle.nextInt();
        
        System.out.print("Informe o valor de b: ");
        int b = oracle.nextInt();
        
//        System.out.println("Informe a operacao: \n 1 - adicao \n 2 - multiplicacao"
//                            + " \n 3 - subtracao \n 4 - divisao");
//        
//        aux = oracle.nextInt();
//        
//        
//        switch (aux) {
//            
//            case 1: 
//                
//                variavelTop = a + b;
//                System.out.println(variavelTop);
//                
//                break;
//                
//            case 2:
//                
//                variavelTop = a * b;
//                System.out.println(variavelTop);
//                
//                break;
//                
//            case 3:
//                
//                variavelTop = a - b;
//                System.out.println(variavelTop);
//                
//                break;
//                
//            case 4:
//                
//                variavelTop = a / b;
//                System.out.println(variavelTop);
//                
//                break;
//                                
//        }
            
        Contas  conta = new Contas (a, b);
        
        System.out.println("Soma: " + conta.soma());
        System.out.println("Multiplicação: " + conta.mult());
        System.out.println("Subtração: " + conta.subt());
        System.out.println("Divisão: " + conta.divi());
        
    }
    
}