package Arrays;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que deseja armazenar no array: ");
        int x = scanner.nextInt();  
        int[] numeros = new int[x]; 
        int i = 0; 

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Exibir números cadastrados");
            System.out.println("3 - Remover número");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1: 
                    if (i < x) {
                        System.out.println("Digite o número para adicionar: ");
                        int numero = scanner.nextInt();
                        numeros[i] = numero;
                        i++;
                        System.out.println("Número adicionado com sucesso!");
                    } else {
                        System.out.println("A inserção não é possível! O array está cheio.");
                    }
                    break;
                    
                case 2: 
                    if (i == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("Números armazenados:");
                        for (int j = 0; j < i; j++) {
                            System.out.println("Índice " + j + ": " + numeros[j]);
                        }
                    }
                    break;

                case 3: 
                    if (i == 0) {
                        System.out.println("Não há números cadastrados para remover.");
                    } else {
                        System.out.println("Digite o índice do número a ser removido:");
                        int indice = scanner.nextInt();

                        
                        if (indice < 0 || indice >= i) {
                            System.out.println("Índice inválido.");
                        } else {
                            
                            for (int j = indice; j < i - 1; j++) {
                                numeros[j] = numeros[j + 1];
                            }
                            i--; 
                            System.out.println("Número removido com sucesso.");
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

