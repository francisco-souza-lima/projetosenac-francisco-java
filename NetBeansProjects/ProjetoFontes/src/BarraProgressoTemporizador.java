
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class BarraProgressoTemporizador extends Thread {

    //declarar variaveis 
    public JProgressBar BARRA = null;
    public JLabel VALOR = null;
    public int posicao = 0;

    //Construtor da classe
    public BarraProgressoTemporizador() {

        posicao = 0;
    }

    //metodo de execucao chamado run
    public void run() {

        while (true && posicao < 20) {
            
            try {//trycatch tab 2x
                
                BARRA.setValue(posicao);
                BARRA.getUI().update(BARRA.getGraphics(), BARRA);
                sleep(50);
                posicao ++;
                VALOR.setText(String.valueOf(posicao));
                VALOR.getUI().update(VALOR.getGraphics(), VALOR);
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }

}
