package projetoentradacomscanner;

import java.util.Scanner;

public class ProjetoEntradaComScanner {

    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        float nota1=0, nota2=0, nota3=0, media=0;
        
        System.out.print("Digite a nota 1: ");
        nota1 = oracle.nextInt();
        
        System.out.print("Digite a nota 2: ");
        nota2 = oracle.nextInt();
        
        System.out.print("Digite a nota 3: ");
        nota3 = oracle.nextInt();
        
        media = ((nota1+nota2+nota3) / 3);
               
        System.out.println("A media é: " + media);
        
    }
    
}
