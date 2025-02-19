package Arrays;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int [] numeros = new int[5];
       int soma = 0;

       for (int i = 0; i < numeros.length; i++){
        System.out.println("Digite o "+(i+1)+"° número: ");
        numeros[i] = scanner.nextInt();
        soma += numeros[i];
    }

    System.out.println("A soma é: "+soma);
    scanner.close();
    }
}
