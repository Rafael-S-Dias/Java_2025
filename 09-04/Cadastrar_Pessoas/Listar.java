package Cadastrar_Pessoas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Listar {
    public static void listar() {
        try{
            BufferedReader leitor = new BufferedReader(new FileReader("Pessoas.txt"));
            String linha;

            System.out.println("\nLista pessoas salvas: ");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Erro ao ler os dados das pessoas");
            e.printStackTrace();
        }
    }
}

