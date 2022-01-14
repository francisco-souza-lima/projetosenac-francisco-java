package projetocadrastocliente;

import javax.swing.JOptionPane;

public class ProjetoOpRelacionais {

    public static void main(String[] args) {
    
        String saida = "";
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("𝙉𝟭: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("𝙉𝟮: "));
        
        if (n1 == n2) {
            
            saida += n1 + " 𝖊́ 𝖎𝖌𝖚𝖆𝖑 𝖆 " + n2 + "\n";
        } 
        if (n1 != n2) {
            
            saida += n1 + " 𝖊́ 𝖉𝖎𝖋𝖊𝖗𝖊𝖓𝖙𝖊 𝖉𝖊 " + n2 + "\n";
        }
        if (n1 > n2) {
            
            saida += n1 + " 𝖊́ 𝖒𝖆𝖎𝖔𝖗 𝖉𝖔 𝖖𝖚𝖊 " + n2 + "\n";
        }
        if (n1 < n2) {
            
            saida += n1 + " 𝖊́ 𝖒𝖊𝖓𝖔𝖗 𝖉𝖔 𝖖𝖚𝖊 " + n2 + "\n";
        }
        if (n1 >= n2) {
            
            saida += n1 + " 𝖊́ 𝖒𝖆𝖎𝖔𝖗 𝖔𝖚 𝖎𝖌𝖚𝖆𝖑 𝖉𝖔 𝖖𝖚𝖊 " + n2 + "\n";
        }
        if (n1 <= n2) {
            
            saida += n1 + " 𝖊́ 𝖒𝖊𝖓𝖔𝖗 𝖔𝖚 𝖎𝖌𝖚𝖆𝖑 𝖉𝖔 𝖖𝖚𝖊 " + n2 + "\n";
        }
        
        JOptionPane.showMessageDialog(null, saida, "𝕯𝖆𝖉𝖔𝖘", JOptionPane.DEFAULT_OPTION);
        
    }
    
}