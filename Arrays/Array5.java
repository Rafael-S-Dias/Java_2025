package Arrays;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que deseja inserir: ");
        int x = scanner.nextInt();
        
        double [] notas = new double[x];
        double soma = 0;

        for (int i=0; i <x; i++){
            System.out.println("Digite a "+(i+1)+"° nota: ");
            double nota = scanner.nextDouble();
            notas[i] = nota;
            soma += notas[i];
        }
         double media = (soma / x);

        System.out.println("Resultados: ");
        for (int i = 0; i < notas.length; i++){
            System.out.println((i+1)+"° Nota: "+notas[i]);
        }
        System.out.println("Media: "+media);

        scanner.close();
    }
}
