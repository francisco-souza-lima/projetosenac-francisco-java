package projetopooimpressao;

import javax.swing.JOptionPane;

public class imprimir {

    public void Imprimir() {
        //metodos sem retornos - VOID
        JOptionPane.showMessageDialog(null, "Ola Boa Tarde!");
    }
    //metodos sem retornos com declaração de variaveis(parametros)

    public void ImprimirTexto(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public void Somar(int a, int b) {
        JOptionPane.showMessageDialog(null, "Soma: " + (a + b));
    }

    public void Quadrado(int c) {
        JOptionPane.showMessageDialog(null, "Raiz Quadrada de: " + c + "= " + Math.pow(c, 2));
    }

    public void MaiorNumero(int x, int y, int z) {
        JOptionPane.showMessageDialog(null, "O maior é: " + Math.max(x, Math.max(y, z)));
    }

    public void Sexo(char genero) {
        if (genero == 'F') {
            JOptionPane.showMessageDialog(null, "Feminino");
        }
        else if (genero == 'M') {
            JOptionPane.showMessageDialog(null, "Masculino");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não Informado");
        }
    }
}
