package Atividades;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a força em Newtons: ");
        Double forca = sc.nextDouble();
        System.out.println("Digite a distância em metros: ");
        Double distancia = sc.nextDouble();


        Double trabalho = (forca * distancia);
        
        System.out.printf("O valor do trabalho segundo a formula T=F*D é: %.2f", trabalho);

        sc.close();
    }
    
}
