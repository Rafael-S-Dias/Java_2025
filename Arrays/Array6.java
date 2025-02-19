package Arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja inserir: ");
        int x = scanner.nextInt();
        
        int [] numeros = new int[x];
        int maior_numero = Integer.MIN_VALUE;

        for (int i=0; i <x; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            int numero = scanner.nextInt();
            numeros[i] = numero;

            if (numero >= maior_numero) {
                maior_numero = numero;
            }
        }

        System.out.println("Números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println((i+1)+"° Número: "+numeros[i]);
        }
        System.out.println("O maior número é: "+maior_numero);


        scanner.close();
    }
}
