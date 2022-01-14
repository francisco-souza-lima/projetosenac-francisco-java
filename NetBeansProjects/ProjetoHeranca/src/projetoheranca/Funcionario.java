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
public class Funcionario extends PessoaFisica {

    private String cartao;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    @Override
    public void mostrarClasse() {

        System.out.println("Classe Funcionario ");
    }

}
