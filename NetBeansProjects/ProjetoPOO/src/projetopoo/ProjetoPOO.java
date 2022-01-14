package projetopoo;
public class ProjetoPOO { 
    
    public static void main(String[] args) {
        
        //trabalhando com Programacao Orientada a Objetos
        
        //Criaremos um "acesso" para a class Garrafa
        //Conhecido como instanciar a classe em um objeto (garrafa1)

        garrafa g1 = new garrafa();
        garrafa g2 = new garrafa("Plastico");
        garrafa g3 = new garrafa(3000);
        garrafa g4 = new garrafa("Vidro", 3500);
        //faremos a chamada das var's publicas 

//        g1.setTipoMaterial("Vrido");
//        g1.setCapacidade(1000 );
//
//        g1.mostrarConteudo();
//        g1.encher();
//        g1.esvaziar();

        g2.esvaziar();
        g3.encher();
        g4.mostrarConteudo();
        
        pessoa p1 = new pessoa("José");
        pessoa p5 = new pessoa("José", "pais");
        pessoa p2 = new pessoa(12);
        pessoa p3 = new pessoa("José", "pai", 2442);
        pessoa p4 = new pessoa();
 
        p3.mostrarNomes();
        p3.idade();
        p5.mostrarNomes();
        p1.mostrarNomes();
  
                
        
//        pessoa p1 = new pessoa();
//        
//        p1.setNome("Francisco");
//        p1.setSobrenome("Lima");
//        p1.setIdade(16);
//        
//        p1.mostrarNomes();
//        p1.idade();
       



     }
    
}