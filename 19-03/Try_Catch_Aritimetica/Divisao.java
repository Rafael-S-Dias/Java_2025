package Try_Catch_Aritimetica;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int resultado = 0;

        System.out.println("Digite seu primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite seu segundo número: ");
        segundoNumero = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Selecione a operação: [+, -, /, *]");
        String operacao = scanner.nextLine();

        try {
            try {
        switch (operacao) {
            case "+":
                resultado = (primeiroNumero + segundoNumero);
                Thread.sleep(1000);
                limpar();
                break;
        
            case "-":
                resultado = (primeiroNumero - segundoNumero);
                Thread.sleep(1000);
                limpar();

                break;
        
            case "/":
                resultado = (primeiroNumero / segundoNumero);
                Thread.sleep(1000);
                limpar();
                break;
        
            case "*":
                resultado = (primeiroNumero * segundoNumero);
                Thread.sleep(1000);
                limpar();
                break;
        
            default:
                System.out.println("Opção inválida.");
                Thread.sleep(1000);
                limpar();
                break;
            }

            } catch(ArithmeticException e) {
                System.out.println("Operação inválida!");
            } finally{
                if (resultado != 0) {
                    System.out.println("O resultado da operação é: "+resultado);
                } else {
                    System.out.println("Não há resultado devido à operação inválida.");
                }
                Thread.sleep(1000);
                System.out.println("Finalizando programa...");
            }
        } catch (InterruptedException e) {
        System.out.println("Erro ao pausar o programa!");
    }
        scanner.close();
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
