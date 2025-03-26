package Cadastro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> list = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("======== MENU =========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            int opcao = scanner.nextInt();

            
            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    System.out.println("Digite o preço do livro: ");
                    double preco = scanner.nextDouble();
                    list.add(new Livro(titulo, autor, anoPublicacao, preco));
                    break;

                case 2:
                if (list.isEmpty()){
                    System.out.println("Lista Vazia!");
                } else {
                    System.out.println("Cadastros: ");
                    for (Livro p:list) {
                        System.out.println("Título: " + p.getTitulo() + " || Autor: " + p.getAutor()+ " || Ano de publicação: " + p.getAnoPublicacao() +" || Preço: R$" + p.getPreco());
                    }
                    break;
                }

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Não há dados para serem excluidos!");
                    } else {
                        scanner.nextLine();
                        System.out.println("Digite o nome do autor: ");
                        String verifica = scanner.nextLine();

                        Iterator<Livro> iterator = list.iterator();
                        boolean encontrado = false;
                        while (iterator.hasNext()) {
                            Livro p = iterator.next();
                            if (p.getAutor().equalsIgnoreCase(verifica)) {
                                iterator.remove();  
                                System.out.println("Livro do autor " + verifica + " removido com sucesso!");
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Nenhum livro encontrado para o autor " + verifica + "!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }

            scanner.close();
         
        
        
            }
    }

    }


