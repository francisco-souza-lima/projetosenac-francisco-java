package projetofuncoes;

import java.util.GregorianCalendar;

public class metodos {
    
    GregorianCalendar today = new GregorianCalendar();

    public String txtMa(String a) {

        return a = a.toUpperCase();
    }

    public String txtMi(String b) {

        return b = b.toLowerCase();
    }

    public String imc(double peso, double alt) {

        String imc = "";
        double conta;

        conta = peso / (alt * alt);

        if (conta < 16) {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Subpeso Severo|";
        } else if (conta >= 16 && conta <= 19.9) {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Subpeso|";
        } else if (conta >= 20 && conta <= 24.9) {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Normal|";
        } else if (conta >= 25 && conta <= 29.9) {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Sobrepeso|";
        } else if (conta >= 30 && conta <= 39.9) {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Obeso|";
        } else {

            imc = "Peso: " + String.format("%.2f kg", conta) + " |Obeso Mórbido|";
        }

        return imc;
    }

    public double aRetangulo(double base, double alt) {

        return base * alt;
    }

    public int idade(int anoN) {

        return today.get(GregorianCalendar.YEAR) - anoN;

    }

}
