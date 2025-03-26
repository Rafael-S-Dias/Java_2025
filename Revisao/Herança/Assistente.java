package Herança;

public class Assistente extends Funcionario {

    public Assistente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

     public void calculaBonus() {
        double bonusAssistente = getSalario() * 0.05;
        System.out.println("O bônus do assistente é: "+bonusAssistente);
     }

     public void exibirInfo() {
        super.exibirInfo();
        calculaBonus();
    }
}
