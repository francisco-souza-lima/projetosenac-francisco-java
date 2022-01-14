package pratica3media;

import java.util.ArrayList;
import java.util.Scanner;

public class PraticaMedia {

    public static void main(String[] args) {

        Scanner oracle = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        double provax = 0;

        String b = "";
        int c = 1;

        System.out.print("Nome do aluno: ");
        String nome = oracle.nextLine();

        System.out.print("Materia: ");
        String mat = oracle.nextLine();

        System.out.print("Quantas provas? ");
        int n = oracle.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Nota da prova " + i + ": ");
            provax = oracle.nextDouble();

            while (provax < 0 || provax > 10) {

                System.out.print("Nota da prova: " + i + ": ");
                provax = oracle.nextDouble();
            }

            lista.add(provax);
        }

        double media = 0;

        System.out.println();

        for (double a : lista) {

            System.out.println("Prova " + c++ + " = " + a);

            media += a;
        }

        media = media / n;

        if (media >= 7) {

            b = "Aprovado";
        } else if (media > 4 || media < 7) {

            b = "Recuperação";
        } else if (media <= 4) {

            b = "Reprovado";
        }

        System.out.println("\n" + "Aluno: " + nome + " \n" + "Estado: " + b + " em " + mat);

    }

}
