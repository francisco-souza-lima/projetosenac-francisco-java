/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetometodos;

public class operacoes {

    public double media(double a, double b, double c) {

        double med = a + b + c / 3;

        return med;
    }

    public int parImpar(int a) {

        int x;

        if (a % 2 == 0) {

            x = 0;

        } else {

            x = 1;
        }

        return x;
    }

    public String parImparTxt(int x) {

        String txt = "";

        if (x == 0) {

            txt += "Par";
        } else {

            txt += "Impar";
        }

        return txt;
    }

    public int repeticaoNum(int val) {

        for (int i = 1; i <= 5; i++) {

            val++;
        }

        return val;
    }

}
