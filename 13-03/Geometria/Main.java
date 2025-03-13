package Geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        try{
            System.out.println("======== CIRCULO =========");
            System.out.println("Defina o raio do circulo: ");
            double raio = scanner.nextDouble();
            Circulo circulo1 = new Circulo(raio, pi);
            Thread.sleep(1000);
            limpar();


            System.out.println("======== RETÂNGULO =========");
            System.out.println("Defina o base do retângulo: ");
            double base = scanner.nextDouble();
            System.out.println("Defina o altura do retângulo: ");
            double altura = scanner.nextDouble();
            Retangulo retangulo1 = new Retangulo(base, altura);
            Thread.sleep(1000);
            limpar();

            retangulo1.calcularArea();
            circulo1.calcularArea();


            scanner.close();
        } catch (InterruptedException e) {
            System.out.println("Erro ao pausar o programa!");
    }
    } 
    public static void limpar() { // função de limpar tela
        try {
            System.getProperty("os.name").contains("Windows");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
        } catch (Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
}
