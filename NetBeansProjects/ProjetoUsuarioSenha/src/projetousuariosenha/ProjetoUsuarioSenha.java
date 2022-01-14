package projetousuariosenha;

import javax.swing.JOptionPane;

public class ProjetoUsuarioSenha {

    public static void main(String[] args) {

        //Utilizando switch case, vai analisar o tipo de login
        //e realizar uma acao
        String login, senha, operacao;
        int op;

        login = JOptionPane.showInputDialog("Informe seu Usuario: ");
        senha = JOptionPane.showInputDialog("Informe sua Senha: ");

        operacao = "Escolha seu tipo de usuário: \n";
        operacao += "1 - Adm \n";
        operacao += "2 - Usuario \n";
        operacao += "3 - Estagiario";

        op = Integer.parseInt(JOptionPane.showInputDialog(operacao));

        switch (op) {
            case 1:

                if (login.equals("adm")) {

                    JOptionPane.showMessageDialog(null, "User: " + login + "\nTipo adm - Tem Acesso Livre!");
                } 
                else {
                    
                    JOptionPane.showMessageDialog(null, "Seu usuario não é adm!");
                }
                break;

            case 2:
                
                if (!login.equals("adm")) {

                    JOptionPane.showMessageDialog(null, "User: " + login + "\nTipo Usuario - Tem Acesso 50% restrito!");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Login Não É Usuario :0");
                }
                break;
                
            case 3:
                
                if (login.equals("estagiario")) {

                    JOptionPane.showMessageDialog(null, "User: " + login + "\nTipo Estagiario - Tem Acesso 100% restrito!");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Login Não É Estagiario :0");
                }
                break;
                
            default:

                JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro!", JOptionPane.WARNING_MESSAGE);
                op = Integer.parseInt(JOptionPane.showInputDialog(operacao));

        }

    }

}