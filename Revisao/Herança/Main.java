package Herança;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione um gerente: ");
        System.out.println("Digite o nome do gerente: ");
        String nome_gerente = scanner.nextLine();
        System.out.println("Digite o cargo: ");
        String cargo_gerente = scanner.nextLine();
        System.out.println("Digite o salario em reais: ");
        double salario_gerente = scanner.nextDouble();
        Gerente g1 = new Gerente(nome_gerente, salario_gerente, cargo_gerente);

        scanner.nextLine();
        System.out.println("\nAdicione um assistente: ");
        System.out.println("Digite o nome do assistente: ");
        String nome_assistente = scanner.nextLine();
        System.out.println("Digite o cargo: ");
        String cargo_assistente = scanner.nextLine();
        System.out.println("Digite o salario em reais: ");
        double salario_assistente = scanner.nextDouble();
        Assistente a1 = new Assistente(nome_assistente, salario_assistente, cargo_assistente);

        System.out.println("\n");
        g1.exibirInfo();
        System.out.println("\n");
        a1.exibirInfo();

        scanner.close();
}
}
