package Atividades;

import java.util.Scanner;

public class Maior_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n1+" é o maior número");
        } else {
            if (n2 > n1) {
            System.out.println(n2+" é o maior número");
            } else {
                System.out.println("Os dois números são iguais");
            }
        }
        sc.close();
    }
}
