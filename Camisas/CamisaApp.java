import java.util.ArrayList;
import java.util.Scanner;

public class CamisaApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Camisa> list = new ArrayList<>();
        int i = 0;

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("======== MENU =========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            int opcao = scanner.nextInt();


            try {
                switch (opcao) {
                    case 1:
                        limpar();
                        scanner.nextLine();
                        System.out.println("Digite a cor da " + (i + 1) + "° camisa: ");
                        String cor = scanner.nextLine();
                        System.out.println("Digite o tamanho da " + (i + 1) + "° camisa: ");
                        String tamanho = scanner.nextLine();
                        System.out.println("Digite o tipo da " + (i + 1) + "° camisa: ");
                        String tipo = scanner.nextLine();
                        list.add(new Camisa(cor, tamanho, tipo));
                        Thread.sleep(2000);
                        limpar();
                        i++;
                        break;

                    case 2:
                         if (list.isEmpty()){
                        System.out.println("Lista Vazia!");
                    } else {
                        System.out.println("Cadastros: ");
                        for (Camisa p:list)
                        System.out.println("Cor: " + p.getCor() + " || Tamanho: " + p.getTamanho()+ "|| Tipo: "+p.getTipo());
                        Thread.sleep(2000);
                        limpar();
                        break;
                    }

                    case 3:
                        if (list.isEmpty()) {
                            System.out.println("Não há dados para serem excluidos!");
                        } else {
                            System.out.println("Digite o número de registro: ");
                            int verificaIndice = scanner.nextInt();
                            if (verificaIndice >= 0 && verificaIndice < list.size()) {
                                System.out.
                                println("Registro encontrado!");
                                System.out.println("Número de Registro (índice): " + verificaIndice);
                                Camisa p = list.get(verificaIndice);
                                System.out.println("Cor: " + p.getCor());
                                System.out.println("Tamanho: " + p.getTamanho());
                                System.out.println("Tipo: " + p.getTipo());
                                Thread.sleep(2000);
                                list.remove(verificaIndice);
                                System.out.println("Registro removido com sucesso.");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                        limpar();
                        break;

                    case 4:
                        limpar();
                        System.out.println("Saindo do programa.");
                        Thread.sleep(1000);
                        limpar();
                        System.out.println("Saindo do programa..");
                        Thread.sleep(1000);
                        limpar();
                        System.out.println("Saindo do programa...");
                        Thread.sleep(2000);
                        limpar();
                        scanner.close();
                        return;
                
                    default:
                        System.out.println("Opção inválida.");
                        Thread.sleep(2000);
                        limpar();
                        break;
                }
            
            } catch (InterruptedException e) {
                System.out.println("Erro ao pausar o programa!");
            }
        
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