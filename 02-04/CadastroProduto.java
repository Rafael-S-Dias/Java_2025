import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter escritor = new FileWriter("Produtos.txt", true);

            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            escritor.write(nome + " - R$ "+ preco +"\n");
            escritor.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar o produto.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}