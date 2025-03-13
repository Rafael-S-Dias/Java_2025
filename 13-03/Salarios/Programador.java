package Salarios;

public class Programador extends Funcionario {
    private int qtds_projetos;
    
    public Programador(String nome, int qtds_projetos) {
        super(nome);
        this.qtds_projetos = qtds_projetos;
    }
    
    public int getQtds_projetos() {
        return qtds_projetos;
    }

    public void setQtds_projetos(int qtds_projetos) {
        this.qtds_projetos = qtds_projetos;
    }

    @Override
    void calcularSalario() {
        double salario = 5000;
        double bonus = 200;
        double valorTotal = salario + (bonus * qtds_projetos);
        System.out.println("O salário base do  é: R$"+salario);
        System.out.println("O valor do bonus por projeto é: R$"+bonus);
        System.out.println("Quantidade de projetos concluidos: "+qtds_projetos);
        System.out.println("O total do valor é: R$"+ valorTotal );
        }
}
