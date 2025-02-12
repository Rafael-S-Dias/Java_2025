package Menu;

import java.util.Scanner;

public class canetas {
    public static void main(String[] args) throws InterruptedException  {
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 1;
        
        while (opcao != 0) {
        System.out.println("=== MENU ===");
        System.out.println("1 - CANETA ESFEROGRÁFICA");
        System.out.println("2 - CANETA GEL");
        System.out.println("3 - CANETA TINTERO");
        System.out.println("0 - SAIR");
        opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                System.out.println("Econômica e de longa duração.");
                Thread.sleep(2000);
                    break;

                case 2:
                System.out.println("Tinta mais pigmentada e escrita suave.");
                Thread.sleep(2000);
                    break;
                case 3:
                System.out.println("Clássica e elegante, usada para caligrafia.");
                Thread.sleep(2000);
                    break;

                case 0:
                break;
            
                default:
                System.out.println("Opção não encontrada, tente novamente!");
                    break;
            }
        }
        scanner.close();
    }
}

