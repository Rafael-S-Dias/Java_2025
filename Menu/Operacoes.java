import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite seu primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite seu segundo número: ");
        int n2 = scanner.nextInt();

        int opcao = 1;
        
        while (opcao != 0) {
        System.out.println("=== MENU ===");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("0 - SAIR");
        opcao = scanner.nextInt();
        

            switch (opcao) {
                case 1:
                    int soma = n1 + n2;
                    System.out.println("Soma: " +soma);
                    limparTela();
                    Thread.sleep(2000);
                    break;

                case 2:
                    int subtração = n1 - n2;
                    System.out.println("Subtração: " +subtração);
                    Thread.sleep(2000);
                    limparTela();
                    break;
                case 3:
                    int multiplicação = n1 * n2;
                    System.out.println("Multiplicação: " +multiplicação);
                    Thread.sleep(2000);
                    limparTela();
                    break;

                case 4:
                    int divisão = n1 / n2;
                    System.out.println("Divisão: " +divisão);
                    Thread.sleep(2000);
                    limparTela();
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("Opção não encontrada, tente novamente!");
                    limparTela();
                    break;
            }

        }
        scanner.close();

}  
        public static void limparTela() throws Exception {
        
                String sistemaOperacional = System.getProperty("os.name").toLowerCase();

                String comando = "";
                if (sistemaOperacional.contains("win")) {
                    comando = "cmd /c cls"; 
                } else {
                    comando = "clear"; 
                }

               Runtime.getRuntime().exec(comando);
        }
}