package projetopooimpressao;

public class ProjetoPOOImpressao {
    
    public static void main(String[] args) {

        //Instancia da classe imprimir
        imprimir imp = new imprimir();
        
        imp.Imprimir();
        imp.ImprimirTexto("Bão?!?!?!?!");        
        imp.MaiorNumero(4, -2341, 6);
        imp.Quadrado(64);
        imp.Somar(4, 5);
        imp.Sexo('F');
    }
    
}
