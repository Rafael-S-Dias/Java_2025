package Veiculos;

public class VeiculoApp {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Meriva", "Chevrolet", 2013, 4);
        Moto moto1 = new Moto("Fatboy", "Harley-Davidson", 2025, 1923 );

        carro1.exibirInfo();
        moto1.exibirInfo();
    }
}
