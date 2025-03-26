package Eletrodomestico;

public class Geladeira extends Eletrodomestico{
    private double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void ligar() {
        System.out.println("Geladeira está ligando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade: "+capacidade);
    }
}
