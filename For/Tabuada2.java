package For;

import java.util.Scanner;

public class Tabuada2 {
    
    public static void main(String[] args) throws Exception, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver a tabuada: ");
        int numero = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println("Tabuada de "+numero+ ": "+numero+" * "+i+" = "+(numero*i));
            }

        scanner.close();
}
}
