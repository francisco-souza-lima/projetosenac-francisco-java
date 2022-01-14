package projetopoo;
 
import javax.swing.JOptionPane;

public class pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    
    //construtor;
    public pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    

    public pessoa() {
    }

    public pessoa(String nome) {
        this.nome = nome;
    }

    public pessoa(int idade) {
        this.idade = idade;
    }
    
    //get/set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Metodos 
    
    public void mostrarNomes() {
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + " \nSobrenome: " + sobrenome);
    }
    
    public void idade() {
        
        JOptionPane.showMessageDialog(null, "Idade: " + idade);
    }
    
}
