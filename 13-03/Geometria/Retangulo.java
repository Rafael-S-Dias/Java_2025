package Geometria;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    void calcularArea() {
        double area = base * altura;
        System.out.println("A área do retangulo é: "+area);
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
}
