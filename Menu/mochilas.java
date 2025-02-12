package Menu;

import java.util.Scanner;

public class mochilas {
    public static void main(String[] args) throws InterruptedException  {
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 1;
        
        while (opcao != 0) {
        System.out.println("=== MENU ===");
        System.out.println("1 - MOCHILA ESCOLAR");
        System.out.println("2 - MOCHILA DE VIAGEM");
        System.out.println("3 - MOCHILA ESPORTIVA");
        System.out.println("0 - SAIR");
        opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                System.out.println("Compacta e ideal para estudantes.");
                Thread.sleep(2000);
                    break;

                case 2:
                System.out.println("Espaçosa, ideal para longas jornadas.");
                Thread.sleep(2000);
                    break;
                case 3:
                System.out.println("Leve, resistente e erghonômica.");
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
