package projetolacofor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaDePeso {
    
    public static void main(String[] args) {
        
        Scanner oracle = new Scanner(System.in);
        
        List<Membro> list = new ArrayList<>();
        
        System.out.print("Quantas pessoas tem na familia? ");
        int n = oracle.nextInt();
                
        for (int i = 0; i < n; i++) {
            
            oracle.nextLine();
            System.out.print("Digite seu nome: ");
            String nome = oracle.nextLine();

            System.out.print("Digite seu peso: ");
            double peso = oracle.nextInt();
            
            System.out.println("");
            
            Membro mem = new Membro(nome, peso);
            
            list.add(mem);
             
        }
        
        double media = 0;
        
        for (Membro m : list) {
            
            oracle.nextLine();
            System.out.println("Nome: " + m.getNome() + " | Peso: " + m.getPeso() + " kg");
            
            media += m.getPeso();
        }
        
        media = media / n;
        
        System.out.println("");

        System.out.printf("Media do Peso da familia: %.2f kg", media);
        
        System.out.println("");
                        
        }
         
    }