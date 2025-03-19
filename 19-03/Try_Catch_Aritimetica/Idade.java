package Try_Catch_Aritimetica;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade <= 0) {
            System.out.println("A idade deve ser maior que zero");
        } else {
            System.out.println("Idade cadastrada com sucesso: "+idade);
        }

        } catch (NumberFormatException e){
            System.out.println("Entrada inválida ");
        } finally{
            System.out.println("Programa finalizado!");
        }
        scanner.close();
    }
}
