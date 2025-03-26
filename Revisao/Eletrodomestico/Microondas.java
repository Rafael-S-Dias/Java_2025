package Eletrodomestico;

public class Microondas extends Eletrodomestico{
    private int tempoMaximo;

    public Microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    @Override
    public void ligar() {
        System.out.println("Microondas está ligando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tempo maximo: "+tempoMaximo);
    }
}
