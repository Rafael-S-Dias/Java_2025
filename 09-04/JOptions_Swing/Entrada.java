package JOptions_Swing;

import javax.swing.JOptionPane;

public class Entrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, "+nome+"!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}
