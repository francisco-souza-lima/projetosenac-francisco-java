package projetopoo; 

import javax.swing.JOptionPane;

public class garrafa {
    
    //Essa classe tera info sobre o projeto garrafa
    
    private String tipoMaterial;
    private int capacidade;    

    //Construtor Vazio
    public garrafa() {
    }
    
    //Construtor
    public garrafa(String tipoMaterial, int capacidade) {
        this.tipoMaterial = tipoMaterial;
        this.capacidade = capacidade;
    }

    //Construtor com tipoMaterial
    public garrafa(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    //Construtor com capacidade
    public garrafa(int capacidade) {
        this.capacidade = capacidade;
    }
    
         
    //encapsulamento das variaveis
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
    //declaração das funçoes 
    //Modificador de acesso + tipo do metodo + nome
    public void encher(){
        
        JOptionPane.showMessageDialog(null, "Enchendo");
    }
    public void esvaziar(){
        
        JOptionPane.showMessageDialog(null, "Esvaziando");
    }
    public void mostrarConteudo(){
        
        JOptionPane.showMessageDialog(null, "Tipo Material: " + tipoMaterial + "\nCapacidade: " + capacidade);
    }
     
}