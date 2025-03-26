package Encapsulamento;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina um produto: ");
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu preço em reais: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        Produto p1 = new Produto(nome, preco,quantidade);

        System.out.println("\n");
        p1.exibirInfo();
        p1.calcularValorTotal();
        
        scanner.close();
    }
}
