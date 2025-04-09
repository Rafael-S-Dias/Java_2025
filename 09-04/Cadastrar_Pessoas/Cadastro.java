package Cadastrar_Pessoas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro {
    public static void cadastrar(Scanner scanner) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("Pessoas.txt", true));

            System.out.println("\nDigite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            escritor.write(nome + " - "+ idade +" anos\n");
            escritor.newLine();
            escritor.close();
            System.out.println("Arquivo salvo com sucesso! \n");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o produto.");
            e.printStackTrace();
        }

    }
}