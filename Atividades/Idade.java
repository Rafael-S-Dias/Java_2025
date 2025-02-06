package Atividades;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Double idade = sc.nextDouble();

        if (idade > 18 && idade < 59){
            System.out.println("É um adulto");
        } else {
            if (idade > 13 && idade < 17){
            System.out.println("É um adolescente");
            } else {
                if (idade > 0 && idade < 12){
                System.out.println("É uma criança");
                } else {
                    System.out.println("É um idoso");
                }
            }
        }

        sc.close();
    }
}
