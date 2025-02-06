package Atividades;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "ALFA";

        System.out.println("Digite sua senha: ");
        String senha = sc.next();

        if (senha.equals(senhaCorreta)) {
            System.out.println("Porta Aberta!");
        } else {
            System.out.println("Porta Fechada");
        }

        sc.close();
    }
}