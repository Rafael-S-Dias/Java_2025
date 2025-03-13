package Menu_Animais;

import java.util.ArrayList;
import java.util.Scanner;

public class Animais_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Cachorro> cachorros = new ArrayList<>();
        ArrayList <Gato> gatos = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("======== MENU =========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - EMITIR SOM");
            System.out.println("3 - SAIR");
            
            int opcao = scanner.nextInt();

        try {
            switch (opcao) {
                case 1:
                    limpar();
                    System.out.println("Selecione que animal deseja adcionar: ");
                    System.out.println("1 - CACHORRO ");
                    System.out.println("2 - GATO ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1:
                            limpar();
                            System.out.println("Escreva o nome do cachorro: ");
                            String nome_cachorro = scanner.nextLine();
                            System.out.println("Digite a quantidades de patas do cachorro: ");
                            int qtds_patas_cachorro = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Escreva a raça do cachorro: ");
                            String raca_cachorro = scanner.nextLine();
                            Cachorro cachorro = new Cachorro(nome_cachorro, qtds_patas_cachorro, raca_cachorro);
                            cachorros.add(cachorro);
                            animais.add(cachorro); 
                            limpar();
                            break;

                        case 2:
                            limpar();
                            System.out.println("Escreva o nome do gato: ");
                            String nome_gato = scanner.nextLine();
                            System.out.println("Digite a quantidades de patas do gato: ");
                            int qtds_patas_gato = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Escreva a cor do gato: ");
                            String cor_gato = scanner.nextLine();
                            Gato gato = new Gato(nome_gato, qtds_patas_gato, cor_gato);
                            gatos.add(gato);
                            animais.add(gato);
                            limpar();
                            break;
                    
                        default:
                            System.out.println("Opção inválida.");
                            Thread.sleep(2000);
                            limpar();
                            break;
                    }

                    break;

                case 2:
                    limpar();
                    if (cachorros.isEmpty() && gatos.isEmpty()){
                        System.out.println("Listas Vazia!");
                        
                    } else {
                    System.out.println("Cachorros Cadastros: ");
                    for (Cachorro p:cachorros)
                    System.out.println("Nome: " + p.getNome() + "\nQuantidade de patas: " + p.getQtds_patas()+ "\nRaça: "+p.getRaca());
                    
                    System.out.println("\nGatos Cadastros: ");
                    for (Gato p:gatos)
                    System.out.println("Nome: " + p.getNome() + "\nQuantidade de patas: " + p.getQtds_patas()+ "\nCor: "+p.getCor());
                    
                    System.out.println("Digite o nome do animal que deseja ouvir o som: ");
                    String verificaNome = scanner.nextLine();

                    boolean encontrado = false;
                    for (Animal animal : animais) {
                        if (animal.getNome().equalsIgnoreCase(verificaNome)) {
                            animal.emitirSom();
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Animal não encontrado.");
                    }
                    break;
                }
                    Thread.sleep(2000);
                    limpar(); 
                    break;

                case 3:
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
