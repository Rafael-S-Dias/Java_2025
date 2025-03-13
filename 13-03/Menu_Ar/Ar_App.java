package Menu_Ar;

import java.util.ArrayList;
import java.util.Scanner;

public class Ar_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Splinter> list = new ArrayList<>();
        ArrayList<Portatil> list2 = new ArrayList<>();
        int i = 0;

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("======== MENU =========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - RELATÓRIO");
            System.out.println("3 - SAIR");
            
            int opcao = scanner.nextInt();

            try{
                switch (opcao) {
                    case 1:
                        limpar();
                        scanner.nextLine();
                        System.out.println("Escolha uma das opções abaixo: ");
                        System.out.println("1 - Splinter");
                        System.out.println("2 - Portatil");           
                        int tipo = scanner.nextInt();

                        switch (tipo) {
                            case 1:
                                limpar();
                                scanner.nextLine();
                                System.out.println("Digite o codigo do "+(i+1)+ "° ar condicionado: ");
                                String codigo_spliter = scanner.nextLine();
                                System.out.println("Digite a marca do "+(i+1)+ "° ar condicionado: ");
                                String marca_spliter = scanner.nextLine();
                                System.out.println("Digite o BTU do "+(i+1)+ "° ar condicionado: ");
                                String btu_spliter = scanner.nextLine();
                                System.out.println("Digite o defeito do "+(i+1)+ "° ar condicionado: ");
                                String defeito_spliter = scanner.nextLine();
                                System.out.println("Digite o tipo do "+(i+1)+ "° ar condicionado: ");
                                String tipos = scanner.nextLine();
                                System.out.println("Digite o tamanho do "+(i+1)+ "° ar condicionado: ");
                                String tamanho = scanner.nextLine();
                                list.add(new Splinter(codigo_spliter, marca_spliter, btu_spliter, defeito_spliter, tipos, tamanho));
                                break;

                            case 2:
                                limpar();
                                scanner.nextLine();
                                System.out.println("Digite o codigo do "+(i+1)+ "° ar condicionado: ");
                                String codigo_portatil = scanner.nextLine();
                                System.out.println("Digite a marca do "+(i+1)+ "° ar condicionado: ");
                                String marca_portatil = scanner.nextLine();
                                System.out.println("Digite o BTU do "+(i+1)+ "° ar condicionado: ");
                                String btu_portatil = scanner.nextLine();
                                System.out.println("Digite o defeito do "+(i+1)+ "° ar condicionado: ");
                                String defeito_portatil = scanner.nextLine();
                                System.out.println("Digite o voltagem do "+(i+1)+ "° ar condicionado: ");
                                String voltagem = scanner.nextLine();
                                System.out.println("Digite o cor do "+(i+1)+ "° ar condicionado: ");
                                String cor = scanner.nextLine();
                                list2.add(new Portatil(codigo_portatil, marca_portatil, btu_portatil, defeito_portatil, voltagem, cor));
                                break;

                            default:
                                System.out.println("Opção inválida.");
                                Thread.sleep(2000);
                                break;
                        }
                        Thread.sleep(1000);
                        limpar();
                        i++;
                        break;

                    case 2:
                        limpar();
                        if (list.isEmpty()){
                            System.out.println("Lista Vazia!");
                        } else {
                        System.out.println("Splinters Cadastros: ");
                        for (Splinter p:list)
                        System.out.println("Código: " + p.getCodigo() + "\nMarca: " + p.getMarca()+ "\nBTU: "+p.getBtu()+ 
                        "\nDefeito: "+p.getDefeito()+ "\nTipo: "+p.getTipos()+ "\nTamanho: "+p.getTamanho());
                        
                        System.out.println("\nPortáteis Cadastros: ");
                        for (Portatil p:list2)
                        System.out.println("Código: " + p.getCodigo() + "\nMarca: " + p.getMarca()+ "\nBTU: "+p.getBtu()+ 
                        "\nDefeito: "+p.getDefeito()+ "\nVoltagem: "+p.getVoltagem()+ "\nCor: "+p.getCor());
                        Thread.sleep(2000);
                        }
                        limpar();    
                        break;

                    case 3:
                        limpar();
                        System.out.println("Saindo do programa.");
                        Thread.sleep(1000);
                        limpar();
                        System.out.println("Saindo do programa..");
                        Thread.sleep(1000);
                        limpar();
                        System.out.println("Saindo do programa...");
                        Thread.sleep(2000);
                        limpar();
                        scanner.close();
                        return;
                        

                    default:
                        System.out.println("Opção inválida.");
                        Thread.sleep(2000);
                        limpar();
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println("Erro ao pausar o programa!");
        }
    }
    }
    public static void limpar() { // função de limpar tela
        try {
            System.getProperty("os.name").contains("Windows");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
        } catch (Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
}

