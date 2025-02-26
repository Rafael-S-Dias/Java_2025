import java.util.ArrayList;
import java.util.Scanner;

public class CarrosApp {
    

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carros> list = new ArrayList<>();
        int i = 0;

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("======== MENU =========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            int opcao = scanner.nextInt();


            try {
                switch (opcao) {
                    case 1:
                        limpar();
                        scanner.nextLine();
                        System.out.println("Digite a marca da " + (i + 1) + "° carro: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo da " + (i + 1) + "° carro: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite o ano da " + (i + 1) + "° carro: ");
                        String ano = scanner.nextLine();
                        list.add(new Carros(marca, modelo, ano));
                        Thread.sleep(2000);
                        limpar();
                        i++;
                        break;

                    case 2:
                        limpar();
                         if (list.isEmpty()){
                        System.out.println("Lista Vazia!");
                    } else {
                        System.out.println("Cadastros: ");
                        for (Carros p:list)
                        System.out.println("Marca: " + p.getMarca() + " || Modelo: " + p.getModelo()+ "|| Ano: "+p.getAnoFabricacao());
                        Thread.sleep(2000);
                        limpar();
                        break;
                    }

                    case 3:
                        limpar();
                        if (list.isEmpty()) {
                            System.out.println("Não há dados para serem excluidos!");
                        } else {
                            System.out.println("Digite o número de registro: ");
                            int verificaIndice = scanner.nextInt();
                            if (verificaIndice >= 0 && verificaIndice < list.size()) {
                                System.out.
                                println("Registro encontrado!");
                                System.out.println("Número de Registro (índice): " + verificaIndice);
                                Carros p = list.get(verificaIndice);
                                System.out.println("Marca: " + p.getMarca());
                                System.out.println("Modelo: " + p.getModelo());
                                System.out.println("Ano: " + p.getAnoFabricacao());
                                Thread.sleep(2000);
                                list.remove(verificaIndice);
                                System.out.println("Registro removido com sucesso.");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                        limpar();
                        break;

                    case 4:
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

