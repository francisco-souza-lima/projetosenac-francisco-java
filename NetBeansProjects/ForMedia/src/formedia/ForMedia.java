package formedia;

import java.util.Scanner;

public class ForMedia {

    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        for (int i = 1; i <= 4; i++) {
      
            System.out.print("Aluno " + i + ": ");            
            String nome1 = oracle.nextLine();
            
            System.out.print("Nota 1 do " + nome1 + ": (0-10) ");
            double n1 = oracle.nextInt();
            
            while (n1 < 0 || n1 > 10) {
                
                System.out.println("Digite um resultado valido!");
                System.out.print("Nota 1 do " + nome1 + ": (0-10) ");
                n1 = oracle.nextInt();
            }
            
            System.out.print("Nota 2 do " + nome1 + ": (0-10) ");
            double n2 = oracle.nextInt();
            
            while (n2 < 0 || n2 > 10) {
                
                System.out.println("Digite um resultado valido!");
                System.out.print("Nota 2 do " + nome1 + ": (0-10) ");
                n1 = oracle.nextInt();
            }
            
            double media = ((n1+n2)/2);
            
            System.out.println("O aluno " + nome1 + " teve media igual a: " + media);
            oracle.nextLine();
            
            if (media < 5){
                System.out.println("Estado: Aluno em recuperação");
            }
            else {
                System.out.println("Estado: Aluno OK");
            }
            
            System.out.println("");

        }

    }

}
    
