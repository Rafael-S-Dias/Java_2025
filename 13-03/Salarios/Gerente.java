package Salarios;

public class Gerente extends Funcionario {
    public Gerente(String nome) {
            super(nome);
        }
    
    @Override
    void calcularSalario() {
        double salario = 8000;
        System.out.println("O salário do gerente é: R$"+salario);
    }
    
}
