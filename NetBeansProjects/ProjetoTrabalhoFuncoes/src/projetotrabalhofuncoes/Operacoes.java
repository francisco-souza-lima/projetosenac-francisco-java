package projetotrabalhofuncoes;

import java.util.Random;

public class Operacoes {
    
    public double pow(double a) {
        
        return Math.pow(a, 2);
    }
    
    public double sqrt(double a) {
        
        return Math.sqrt(a);
    }
    
    public int random(int c) {
        
        int a = 0;
        int b = 21;
        
        Random rd = new Random();
        c = rd.nextInt(a + b) + a;
        
        return c;
    }
    
    public double arred(double a){
        
        return Math.floor(a);
    }
    
    public double max(double a, double b, double c){
        
        return Math.max(a, Math.max(b, c));
    }
    
}
