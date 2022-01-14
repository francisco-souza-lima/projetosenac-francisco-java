package projetopooretorno;

import javax.swing.JOptionPane;

public class opretorno {

    public double somar(double a, double b) {

        return a + b;
    }

    public String pares(int valor) {
        
        String retorno = "";
        
        for (int a = 0; a < valor; a = a+2) {
 
            retorno += a + "";
        }
        return retorno;

    }
    
    public String diaPorExtenso(int dia) {
        
        String extenso = "domingo";
        
        if (dia == 1) {
            
            extenso = "domingo";
        }
        else if (dia == 2) {
            
            extenso = "segunda-feira";
        }
        else if (dia == 3) {
            
            extenso = "terca-feira";
        }
        else if (dia == 4) {
            
            extenso = "quarta-feira";
        }
        else if (dia == 5) {
            
            extenso = "quinta-feira";
        }
        else if (dia == 6) {
            
            extenso = "sexta-feira";
        }
        else if (dia == 7) {
            
            extenso = "sabado";
        }
        else {
            
            extenso = "Dia nao reconhecido";
        }
        return extenso;
    }
    
    public int contarLetras (String palavra) {
        
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        
        for (int i = 0; i < palavra.length(); i++) {
            
            if (palavra.charAt(i)=='A') {
                
                quantidade++;                
            }
            
        }
        
        return quantidade;
    }
    
}

