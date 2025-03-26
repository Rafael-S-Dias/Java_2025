package Encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: R$"+preco);
        System.out.println("Quantidade: "+quantidade);
    }

    public void calcularValorTotal() {
        double estoque = (preco * quantidade);
        System.out.println("O valor do estoque do produto registrado é: "+estoque);
    }
}
