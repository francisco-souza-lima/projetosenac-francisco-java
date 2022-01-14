/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocalc;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.eslima1
 */
public class ProjetoCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            operacoes op = new operacoes();

            int a, b;

            a = Integer.parseInt(JOptionPane.showInputDialog("Soma A: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Soma B: "));

            JOptionPane.showMessageDialog(null, op.soma(a, b));

            a = Integer.parseInt(JOptionPane.showInputDialog("Subtracao A: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Subtracao B: "));

            JOptionPane.showMessageDialog(null, op.subt(a, b));

            a = Integer.parseInt(JOptionPane.showInputDialog("Multiplicacao A: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Multiplicacao B: "));

            JOptionPane.showMessageDialog(null, op.mult(a, b));

            a = Integer.parseInt(JOptionPane.showInputDialog("Divisao A: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Divisao B: "));

            JOptionPane.showMessageDialog(null, op.div(a, b));
            
        } catch (ArithmeticException erro) {

            JOptionPane.showMessageDialog(null, "Não é possivel dividir por 0");
        } catch (NumberFormatException erro){
            
            JOptionPane.showMessageDialog(null, "Digite apenas numeros int");
        }
        
        
    }

}
