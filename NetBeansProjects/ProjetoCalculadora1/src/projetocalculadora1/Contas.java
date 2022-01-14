package projetocalculadora1;

public class Contas {
    
    private int a,b;

    public Contas(int a, int b) {
        this.a = a;
        this.b = b;
    }    
    
    public int soma() {
        
        return a += b;
    }
    
    public int mult() {
        
        return a *= b;
    }
    
    public int subt() {
        
        return a -= b;
    }
    
    public int divi() {
        
        return a /= b;
    }
    
}
