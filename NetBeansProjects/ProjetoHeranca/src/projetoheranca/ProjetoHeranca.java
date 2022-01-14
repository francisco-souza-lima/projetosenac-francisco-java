/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.eslima1
 */
public class ProjetoHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Funcionario f = new Funcionario();
//
//        f.setCartao("5555");
//        f.setCpf("111.555.888-99");
//        f.setNome("Nome Herdado da classe Pessoa");
//
//        System.out.println("O seu cartao: " + f.getCartao());
//        System.out.println("O seu CPF é: " + f.getCpf());
//        System.out.println("Seu nome é: " + f.getNome());

        Pessoa p = null;

        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe um n de 1 a 4: "));

        switch (tipo) {
            case 1:
                p = new Pessoa();
                break;
            case 2:
                p = new PessoaFisica();
                break;
            case 3:
                p = new PessoaJuridica();
                break;
            case 4:
                p = new Funcionario();
                break;
            default:
                System.out.println("Opção Invalida!");
                System.exit(0);
        }   
        
        p.mostrarClasse();

    }

}
