package Atividades;
import java.util.Scanner;

public class Maior_de_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Double idade = sc.nextDouble();

        if (idade >= 18){
            System.out.println("O indivíduo é maior de idade");
        } else {
            System.out.println("O indivíduo é menor de idade");
        }

        sc.close();
    }
}
