/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoheranca;

/**
 *
 * @author francisco.eslima1
 */
public class PessoaJuridica extends Pessoa {
        
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void mostrarClasse() {
        
        System.out.println("Classe Pessoa Juridica");
    }
     
}
