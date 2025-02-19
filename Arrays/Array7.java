package Arrays;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] numeros = new int[10];
        int maior_numero = Integer.MIN_VALUE;
        int menor_numero = Integer.MAX_VALUE;

        for (int i=0; i < numeros.length; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            int numero = scanner.nextInt();
            numeros[i] = numero;

            if (numero >= maior_numero) {
                maior_numero = numero;
            }

            if (numero <= menor_numero) {
                menor_numero = numero;
            }
        }

        System.out.println("Números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println((i+1)+"° Número: "+numeros[i]);
        }
        System.out.println("O maior número é: "+maior_numero);
        System.out.println("O menor número é: "+menor_numero);


        scanner.close();
    }
}
