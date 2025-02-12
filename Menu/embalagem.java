package Menu;

import java.util.Scanner;

public class embalagem {
    public static void main(String[] args) throws InterruptedException, Exception {
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 1;
        
        while (opcao != 0) {
        System.out.println("=== MENU ===");
        System.out.println("1 - CAIXA DE PAPELÃO");
        System.out.println("2 - SACO DE PLÁSTICA");
        System.out.println("3 - CAIXA DE VIDRO");
        System.out.println("0 - SAIR");
        System.out.println("\nEscolha a opção desedjada: ");
        opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                System.out.println("Ideal para transporte e armazenamento.");
                Thread.sleep(2000);
                limparTela();
                    break;

                case 2:
                System.out.println("Leve e prática, mas pouco sustentável.");
                Thread.sleep(2000);
                limparTela();
                    break;
                case 3:
                System.out.println("Resistencia e reutilizável.");
                Thread.sleep(2000);
                limparTela();
                    break;

                case 0:
                limparTela();
                break;
            
                default:
                System.out.println("Opção não encontrada, tente novamente!");
                Thread.sleep(2000);
                limparTela();
                    break;
            }
        }
        scanner.close();
    }

        // Método para limpar o terminal
        public static void limparTela() throws Exception {
            String sistemaOperacional = System.getProperty("os.name").toLowerCase();
    
            String comando = "";
            if (sistemaOperacional.contains("win")) {
                comando = "cls";  // Windows
            } else {
                comando = "clear";  // Linux / macOS
            }
    
            // Executa o comando para limpar o terminal
            Runtime.getRuntime().exec(comando);
        }
}
