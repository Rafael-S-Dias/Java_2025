import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> list = new ArrayList<>();
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
                    System.out.println("Digite o nome do " + (i + 1) + "° contato: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o número do " + (i + 1) + "° contato: ");
                    String telefone = scanner.nextLine();
                    list.add(new Pessoa(nome, telefone));
                    Thread.sleep(2000);
                    limpar();
                    i++;
                    break;

                case 2:
                if (list.isEmpty()){
                    System.out.println("Lista Vazia!");
                } else {
                    System.out.println("Cadastros: ");
                    for (Pessoa p:list)
                    System.out.println("Nome: " + p.getNome() + " || Telefone: " + p.getTelefone());
                    Thread.sleep(2000);
                    limpar();
                    break;
                }

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Não há dados para serem excluidos!");
                    } else {
                        System.out.println("Escolha qual chave utilizar para a exclusão do contato: ");
                        System.out.println("1 - Pelo número de registro");
                        System.out.println("2 - Pelo nome");
                        System.out.println("3 - Pelo número de telefone");
                        int escolha = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolha) {
                            case 1:
                                System.out.println("Digite o número de registro: ");
                                int verificaIndice = scanner.nextInt();
                                if (verificaIndice >= 0 && verificaIndice < list.size()) {
                                    System.out.
                                    println("Registro encontrado!");
                                    System.out.println("Número de Registro (índice): " + verificaIndice);
                                    Pessoa p = list.get(verificaIndice);
                                    System.out.println("Nome: " + p.getNome());
                                    System.out.println("Telefone: " + p.getTelefone());
                                    Thread.sleep(2000);
                                    list.remove(verificaIndice);
                                    System.out.println("Registro removido com sucesso.");
                                } else {
                                    System.out.println("Índice inválido.");
                                }

                                break;

                            case 2:
                                System.out.println("Digite o nome do cadastro: ");
                                String verificaNome = scanner.nextLine();
                                boolean nomeEncontrado = false;
                                for (Pessoa p: list) {
                                    if (p.getNome().equals(verificaNome)) {
                                        System.out.println("Nome encontrado!");
                                        list.remove(p);
                                        System.out.println("Registro removido com sucesso.");
                                        nomeEncontrado = true;
                                        break;
                                    }
                                }
                                if (!nomeEncontrado) {
                                    System.out.println("Nome inválido.");
                                }
                                break;

                            case 3:
                                System.out.println("Digite o telefone do cadastro: ");
                                String verificaTelefone = scanner.nextLine();
                                boolean telefoneEncontrado = false;
                                for (Pessoa p: list) {
                                    if (p.getTelefone().equals(verificaTelefone)) {
                                        System.out.println("Telefone encontrado!");
                                        list.remove(p);
                                        System.out.println("Registro removido com sucesso.");
                                        telefoneEncontrado = true;
                                        break;
                                    }
                                }
                                if (!telefoneEncontrado) {
                                    System.out.println("Telefone inválido.");
                                }
                                break;

                            default:
                                System.out.println("Opção inválida.");
                                Thread.sleep(2000);
                                limpar();
                                break;
                        }
                    }
                    Thread.sleep(2000);
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
            }

        } catch (InterruptedException e) {
            System.out.println("Erro ao pausar o programa.");
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
