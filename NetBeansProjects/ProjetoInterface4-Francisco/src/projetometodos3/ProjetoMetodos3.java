package projetometodos3;
 
public class ProjetoMetodos3 {
    
    public static void main(String[] args) {
        
        //Testando a classe passagem parametros
        
        PassagemParametros p = new PassagemParametros();
        
        System.out.println("Testando Passagem por VALOR");
        
        int valor = 0;
        
        System.out.println("ANTES - Valor: " + valor);
        p.porValor(valor);
        
        System.out.println("DEPOIS - Valor: " + valor);
        
        //Testando a classe MinhaClasse
        
        System.out.println("\n\nTestando Passagen Por REFERENCIA:");
        
        MinhaClasse m = new MinhaClasse();
        
        System.out.println("ANTES - " + m.getValor());
        p.porParametros(m);
        System.out.println("DEPOIS - " + m.getValor());
        
     }
    
}
