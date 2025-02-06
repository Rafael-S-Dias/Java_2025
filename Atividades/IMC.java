package Atividades;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso em Kgs: ");
        Double peso = sc.nextDouble();
        System.out.println("Digite a altura em metros: ");
        Double altura = sc.nextDouble();


        Double IMC = (peso /(altura * altura));
        
        System.out.printf("O IMC do individuo é: %.2f", IMC);

        sc.close();
    }
}
