/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofor2;

import java.util.Scanner;

/**
 *
 * @author francisco.eslima1
 */
public class ExercicioFor1 {

    public static void main(String[] args) {

        Scanner oracle = new Scanner(System.in);

        System.out.print("Me diga um numero natural e eu o direi os 8 numeros seguintes: ");
        int n = oracle.nextInt();

        for (int i = 1; i <= 8; i++) {

            System.out.print(n + i + ", ");

            if (i == 8) {

                System.out.println("Impressionado?");
            }
        }

        System.out.print("Agora me diga um numero natural e eu o direi os 8 numeros anteriores: ");
        n = oracle.nextInt();

        for (int i = 1; i <= 8; i++) {

            System.out.print(n - i + ", ");

            if (i == 8) {

                System.out.println("Impressionado?");
            }
        }
        
        System.out.print("Agora me diga um numero natural e eu o direi os 7 numeros seguintes com seu triplo: ");
        n = oracle.nextInt();
        
        for (int i = 1; i <= 7; i++) {
            
            System.out.print((n * 3) + ", "); n++;
                        
            if (i == 7) {

                System.out.println("Impressionado?");
            }
            
        }
        
        System.out.print("Diga-me um numero: ");
        n = oracle.nextInt();
        
        if (n >= 100) {
            
            for (int i = 1; i <= 5; i++) {
                
                System.out.print((n + i) + ", ");
               
                if (i == 5) {

                    System.out.println("Impressionado?");
                }
            }
        }
        else {
            
            for (int i = 1; i <= 5; i++) {
                
                System.out.print((n - i) + ", ");
               
                if (i == 5) {

                    System.out.println("Impressionado?");
                }
            }
        }
         
    }
}