package Eletrodomestico;

public class Main {
    public static void main(String[] args) {

        Geladeira g1 = new Geladeira("A", 150, 200);
        Microondas m1 = new Microondas("B", 250, 2);
    
        g1.ligar();
        g1.exibirInfo();
        m1.exibirInfo();
        m1.ligar();
        
    }
}
