package Atividades;

import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O número "+numero+" é positivo");
        } else {
            if (numero == 0) {
            System.out.println("O número "+numero+" é nulo");
            } else {
                System.out.println("O número "+numero+" é negativo");
            }
        }

        sc.close();
    }
}
