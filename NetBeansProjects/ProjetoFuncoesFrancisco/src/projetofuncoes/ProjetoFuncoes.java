package projetofuncoes;
import javax.swing.JOptionPane;

public class ProjetoFuncoes {

    public static void main(String[] args) {

        metodos op = new metodos();

        String menu = "Selecione uma das opções \n"
                + "1 - Converter texto para MAIUSCULO \n"
                + "2 - Convertet texto para minusculo \n"
                + "3 - Calculo de IMC \n"
                + "4 - Calculo de Idade \n"
                + "5 - Calculo da Area do retangulo: ";

        do {
            
            int m = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (m) {
                case 1:

                    do {
                        String txt1 = JOptionPane.showInputDialog("Digite algo e-lhe mostrarei esse texto em 'MAIUSCULO'", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, op.txtMa(txt1));
                    } while (JOptionPane.showConfirmDialog(null, "Quer Realizar a Operação novamente? ", "", JOptionPane.YES_OPTION) == 0);
                    break;
                case 2:

                    do {
                        String txt2 = JOptionPane.showInputDialog("Digite algo e-lhe mostrarei esse texto em 'minusculo'", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, op.txtMi(txt2));
                    } while (JOptionPane.showConfirmDialog(null, "Quer Realizar a Operação novamente?", "", JOptionPane.YES_OPTION) == 0);
                    break;
                case 3:

                    do {
                        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso:", JOptionPane.INFORMATION_MESSAGE));
                        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura:", JOptionPane.INFORMATION_MESSAGE));
                        JOptionPane.showMessageDialog(null, "IMC (peso / (alt * alt)): \n" + op.imc(a, b));
                    } while (JOptionPane.showConfirmDialog(null, "Quer Realizar a Operação novamente?", "", JOptionPane.YES_OPTION) == 0);
                    break;
                case 4:

                    do {
                        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu e lhe mostrarei a sua idade: ", JOptionPane.INFORMATION_MESSAGE));
                        JOptionPane.showMessageDialog(null, op.idade(c));
                    } while (JOptionPane.showConfirmDialog(null, "Quer Realizar a Operação novamente?", "", JOptionPane.YES_OPTION) == 0);
                    break;
                case 5:

                    do {
                        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: ", JOptionPane.INFORMATION_MESSAGE));
                        double e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: ", JOptionPane.INFORMATION_MESSAGE));
                        JOptionPane.showMessageDialog(null, op.aRetangulo(d, e));
                    } while (JOptionPane.showConfirmDialog(null, "Quer Realizar a Operação novamente?", "", JOptionPane.YES_OPTION) == 0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um numero valido!", "", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Gostaria de voltar ao Menu?", "", JOptionPane.YES_OPTION) == 0);

    }

}
