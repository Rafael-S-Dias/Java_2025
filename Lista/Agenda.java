package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> nomes = new ArrayList<>();
            List<String> telefones = new ArrayList<>();
            int i = 0;

            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Cadastrar contato");
                System.out.println("2 - Listar contatos cadastrados");
                System.out.println("3 - Excluir cadastro");
                System.out.println("4 - Sair");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        scanner.nextLine();
                        System.out.println("Digite o nome do " + (i + 1) + "° contato: ");
                        String nome = scanner.nextLine();
                        nomes.add(nome);
                        
                        System.out.println("Digite o número do " + (i + 1) + "° contato: ");
                        String telefone = scanner.nextLine();
                        telefones.add(telefone);
                        Thread.sleep(2000);
                        limpar();
                        i++;
                        break;

                    case 2:
                        System.out.println("Cadastros: ");
                        for (int x = 0; x < nomes.size(); x++) {
                            System.out.println("Nome: " + nomes.get(x) + " || Telefone: " + telefones.get(x)+ " || Indice: "+x);
                        }
                        Thread.sleep(2000);
                        limpar();
                        break;

                    case 3:
                        if (nomes.isEmpty()) {
                            System.out.println("Não há dados para serem excluidos!");
                        } else {
                            System.out.println("Escolha qual chave utilizar para a exclusão do contato: ");
                            System.out.println("1 - Pelo número de registro");
                            System.out.println("2 - Pelo nome");
                            System.out.println("3 - Pelo número de telefone");
                            int escolha = scanner.nextInt();
                            switch (escolha) {
                                case 1:
                                    System.out.println("Digite o número de registro: ");
                                    int verificaIndice = scanner.nextInt();
                                    if (verificaIndice >= 0 && verificaIndice < nomes.size()) {
                                        System.out.println("Registro encontrado!");
                                        System.out.println("Número de Registro (índice): " + verificaIndice);
                                        System.out.println("Nome: " + nomes.get(verificaIndice));
                                        System.out.println("Telefone: " + telefones.get(verificaIndice));
                                        Thread.sleep(2000);
                                        nomes.remove(verificaIndice);
                                        telefones.remove(verificaIndice);
                                        System.out.println("Registro removido com sucesso.");
                                    } else {
                                        System.out.println("Índice inválido.");
                                    }

                                    break;
                                case 2:
                                    System.out.println("Digite o nome do cadastro: ");
                                    String verificaNome = scanner.nextLine();
                                    for (int x = 0; x < nomes.size(); x++) {
                                    if (nomes.get(x).equals(verificaNome)) {
                                        System.out.println("Nome encontrado!");

                                        Thread.sleep(2000);
                                        nomes.remove(verificaNome);
                                        telefones.remove(verificaNome);
                                        System.out.println("Registro removido com sucesso.");
                                    } else {
                                        System.out.println("Nome inválido.");
                                    }
                                }
                                    break;
                                case 3:
                                    System.out.println("Digite o telefone do cadastro: ");
                                    String verificaTelefone = scanner.nextLine();
                                    for (int x = 0; x < nomes.size(); x++) {
                                    if (telefones.get(x).equals(verificaTelefone)) {
                                        System.out.println("Nome encontrado!");
                                        Thread.sleep(2000);
                                        nomes.remove(verificaTelefone);
                                        telefones.remove(verificaTelefone);
                                        System.out.println("Registro removido com sucesso.");
                                    } else {
                                        System.out.println("Telefone inválido.");
                                    }
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
                        return;

                    default:
                        System.out.println("Opção inválida.");
                        Thread.sleep(2000);
                        limpar();
                }

                // scanner.close();
            }
        }

    }

    public static void limpar() {// função limpar tela
        try {
            // Limpa o console de acordo com o sistema operacional
            System.getProperty("os.name").contains("Windows");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
}