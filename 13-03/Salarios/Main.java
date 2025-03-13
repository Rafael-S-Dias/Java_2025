package Salarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        try {
            System.out.println("Digite o nome do gerente: ");
            String nome_gerente = scanner.next();
            Gerente g1 = new Gerente(nome_gerente);
            Thread.sleep(1000);
            limpar();
            
            System.out.println("Digite o nome do programador: ");
            String nome_projeto = scanner.next();
            System.out.println("Digite a quantidade de projetos concluidos: ");
            int projetos = scanner.nextInt();
            Programador p1 = new Programador(nome_projeto, projetos);
            Thread.sleep(1000);
            limpar();

            g1.calcularSalario();
            System.out.println("\n");
            p1.calcularSalario();

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
