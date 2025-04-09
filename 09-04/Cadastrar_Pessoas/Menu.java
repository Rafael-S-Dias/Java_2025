package Cadastrar_Pessoas;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args)  throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("=== MENU ===");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("0 - SAIR");
            System.out.print("Escolha uma opção: ");
            

            opcao = scanner.nextInt();
            scanner.nextLine();
            
    
                switch (opcao) {
                    case 1:
                        Cadastro.cadastrar(scanner);
                        Thread.sleep(500);
                        break;
    
                    case 2:
                        Listar.listar();
                        Thread.sleep(2000);
                        break;

                    case 0:
                        System.out.println("Saindo.");
                        Thread.sleep(1000);
                        System.out.println("Saindo..");
                        Thread.sleep(1000);
                        System.out.println("Saindo...");
                        Thread.sleep(1000);
                        break;
                
                    default:
                        System.out.println("Opção não encontrada, tente novamente!");
                        break;

                }
            }  
            scanner.close();  
    }
}
