package projetometodos3;

public class PassagemParametros {

    //Vamos Criar Metodos que vão ilustrar a passagem 
    //de valores por parametros 
    public void porValor(int _valor) {
        
        _valor = 100;
    }
    
    public void porParametros(MinhaClasse a ) {
        
        //vamos criar essa classe e os atributos 
        a.setValor(100);
    }
    
    
    
}
