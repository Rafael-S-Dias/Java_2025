package Geometria;

public class Circulo extends Forma {
    private double raio;
    private double pi;

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    void calcularArea() {
        double area = raio * (pi *pi);
        System.out.printf("A área do circulo é: "+ String.format("%.2f", area) );
    }



    public double getRaio() {
        return raio;
    }



    public void setRaio(double raio) {
        this.raio = raio;
    }



    public double getPi() {
        return pi;
    }



    public void setPi(double pi) {
        this.pi = pi;
    }
}
