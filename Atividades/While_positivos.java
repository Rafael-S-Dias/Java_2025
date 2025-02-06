package Atividades;

import java.util.Scanner;

public class While_positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int i = 1;

        while(numero > 0){
            System.out.println("Digite o "+i+ "º número: ");
            numero = sc.nextInt();
            i++;
        }

        sc.close();
    }
}