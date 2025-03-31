import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int MAX_AVIOES = 4;
    static int MAX_RESERVAS = 20;
    static ArrayList<Aviao> avioes = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - REGISTRAR NÚMEROS DOS AVIÕES");
            System.out.println("2 - REGISTRAR QUANTIDADE DE ASSENTOS DISPONÍVEIS EM CADA AVIÃO");
            System.out.println("3 - RESERVAR PASSAGEM AÉREA");
            System.out.println("4 - REALIZAR CONSULTA POR AVIÃO");
            System.out.println("5 - REALIZAR CONSULTA POR PASSAGEIRO ");
            System.out.println("6 - ENCERRAR ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (!avioes.isEmpty()) {
                        System.out.println("Os aviões já foram registrados.");
                        return;
                    }
                    for (int i = 0; i < MAX_AVIOES; i++) {
                        System.out.print("Informe o número do " +(i + 1)+ "º avião: ");
                        int numero = scanner.nextInt();
                        avioes.add(new Aviao(numero, 0));
                    }
                    break;
                    
                    case 2:
                        if (avioes.isEmpty()) {
                            System.out.println("Registre os aviões primeiro.");
                            return;
                        }
                        for (Aviao x : avioes) {
                            System.out.print("Informe o número de assentos disponíveis para do avião nº" +x.getNumero()+ " :"  );
                            int assentos = scanner.nextInt();
                            x.setAssentosDisponiveis(assentos);
                        }
                        System.out.println("Assentos registrados com sucesso!");
                    break;

                case 3:
                    if (reservas.size() >= MAX_RESERVAS) {
                        System.out.println("Limite máximo de reservas atingido!");
                        return;
                    }
                    System.out.print("Informe o número do avião: ");
                    int numeroAviao = scanner.nextInt();
                    scanner.nextLine();
                    
                    Aviao y = encontrarAviao(numeroAviao);
                    if (y == null) {
                        System.out.println("Este avião não existe!");
                        return;
                    }
                    if (y.getAssentosDisponiveis() == 0) {
                        System.out.println("Não há assentos disponíveis para este avião!");
                        return;
                    }
                    
                    System.out.print("Informe o nome do passageiro: ");
                    String passageiro = scanner.nextLine();
                    reservas.add(new Reserva(numeroAviao, passageiro));
                    y.reduzirAssento();
                    System.out.println("Reserva realizada com sucesso!");
                    break;

                case 4:
                    System.out.print("Informe o número do avião: ");
                    int numeroAviao2 = scanner.nextInt();
                    scanner.nextLine();

                    Aviao z = encontrarAviao(numeroAviao2);
                    if (z == null) {
                        System.out.println("Este avião não existe!");
                        return;
                    }
                    
                    int j = 0;
                    for (Reserva reserva : reservas) {
                        if (reserva.getNumeroAviao() == numeroAviao2) {
                            System.out.println("Passageiro: " + reserva.getPassageiro());
                            j++;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Não há reservas realizadas para este avião!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome do passageiro: ");
                    String nome = scanner.nextLine();

                    int l = 0;
                    for (Reserva reserva : reservas) {
                        if (reserva.getPassageiro().equalsIgnoreCase(nome)) {
                            System.out.println("Avião: " + reserva.getNumeroAviao());
                            l++;
                        }
                    }
                    if (l == 0) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando programa!");

                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            scanner.close();
        }
    }
    
    private static Aviao encontrarAviao(int numero) {
        for (Aviao aviao : avioes) {
            if (aviao.getNumero() == numero) {
                return aviao;
            }
        }
        return null;
    }
}
