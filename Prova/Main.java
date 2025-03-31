import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Passageiro> passageiros = new ArrayList<>();
        ArrayList<Assentos> assentos = new ArrayList<>();

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
                    System.out.println("\n");
                    System.out.println("INFORME OS NÚMEROS DOS QUATRO AVIÕES ");
                    System.out.println("Digite o números do primeiro avião: ");
                    int primeiroAviao = scanner.nextInt();

                    System.out.println("Digite o números do segundo avião: ");
                    int segundoAviao = scanner.nextInt();

                    System.out.println("Digite o números do terceiro avião: ");
                    int terceiroAviao = scanner.nextInt();

                    System.out.println("Digite o números do quarto avião: ");
                    int quartoAviao = scanner.nextInt();


                    avioes.add(new Aviao(primeiroAviao));
                    avioes.add(new Aviao(segundoAviao));
                    avioes.add(new Aviao(terceiroAviao));
                    avioes.add(new Aviao(quartoAviao));
                    
                    break;
                    
                    case 2:
                    System.out.println("\n");
                    System.out.println("INFORME A QUANTIDADE DE ASSENTOS DE CADA AVIÃO ");
                    System.out.println("Digite a quantidade de assentos do primeiro avião: ");
                    int assentos1 = scanner.nextInt();
                    
                    System.out.println("Digite a quantidade de assentos do segundo avião: ");
                    int assentos2 = scanner.nextInt();
                    
                    System.out.println("Digite a quantidade de assentos do terceiro avião: ");
                    int assentos3 = scanner.nextInt();
                    
                    System.out.println("Digite a quantidade de assentos do quarto avião: ");
                    int assentos4 = scanner.nextInt();

                    assentos.add(new Assentos(assentos1));
                    assentos.add(new Assentos(assentos2));
                    assentos.add(new Assentos(assentos3));
                    assentos.add(new Assentos(assentos4));
                    
                    break;
                case 3:
                    System.out.println("\n");
                    int i = 0;
                    if (i<=20) {
                        System.out.println("Digite o número do avião desejado: ");
                        int verificaAviao = scanner.nextInt();

                        if (avioes.get(verificaAviao) != null) {
                            System.out.println("Este avião não existe!");

                        } else {
                            if (assentos.isEmpty()) {
                                System.out.println("Não há assentos disponiveis para esse avião");
                            } else {
                                System.out.println("Escreva o nome do passageiro: ");
                                String nome = scanner.next();
                                passageiros.add(new Passageiro(verificaAviao,nome));
                                System.out.println("Reserva realizada com sucesso!");
                                i++;
                            }
                        }

                    } else {
                        System.out.println("Quantidade de reservas excedidas");
                    }
                    
                    break;
                case 4:
                    int x = 0;
                    for(x=0; x < avioes.size(); x++) {
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Informe o nome do passageiro: ");
                    String verificaNome = scanner.nextLine();
                    int y = 0;
                    for(y=0; y < passageiros.size(); y++) {
                        System.out.println("O passageiro "+passageiros.get(verificaNome));
                    }
                    break;
                case 6:
                    System.out.println("Encerrando programa!");

                    break;
            
                default:
                    break;
            }
            
        }
    }
}
