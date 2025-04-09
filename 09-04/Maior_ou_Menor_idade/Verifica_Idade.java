package Maior_ou_Menor_idade;

import javax.swing.JOptionPane;

public class Verifica_Idade {
    public static void main(String[] args) {
        try {
        String numero = JOptionPane.showInputDialog("Digite sua idade: ");
        
        int idade = Integer.parseInt(numero);
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, idade+" anos, voce é maior de idade!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null, idade+" anos, voce é menor de idade!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            
        } 
        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }
    }
}
