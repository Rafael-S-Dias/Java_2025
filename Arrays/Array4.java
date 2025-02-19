package Arrays;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de nomes que deseja inserir: ");
        int x = scanner.nextInt();
        
        String [] nomes = new String[x];

        for (int i=0; i <x; i++){
            System.out.println("Digite o "+(i+1)+"° nome: ");
            String nome = scanner.next();
            nomes[i] = nome;
        }
        System.out.println("Nomes: ");
        for (int i = 0; i < nomes.length; i++){
            System.out.println((i+1)+"° Nome: "+nomes[i]);
        }

        scanner.close();
    }
}
