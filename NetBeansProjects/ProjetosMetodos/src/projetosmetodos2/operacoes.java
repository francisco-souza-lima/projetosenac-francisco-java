package projetosmetodos2;

import java.util.Random;
import javax.swing.JOptionPane;

public class operacoes {

    public String exibirNomes(String nome, String sobrenome) {

        String n = "";
        return n = nome + " " + sobrenome;
    }

    public double valorQuadrado(double x) {

        return Math.pow(x, 2);
    }

    public int sorteio( ) {
        
        int a = 0;
        int b = 10;
        
        Random rd = new Random();
        int v = rd.nextInt(a + b) + a;
        
        return v;
    }
}
