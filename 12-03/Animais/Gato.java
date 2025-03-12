package Animais;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int patas, String cor) {
        super(nome, patas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirSom(){
        System.out.println("Nome: "+getNome()+" | Patas: "+getPatas()+" | Cor: "+getCor()+" | Som: Mia");
    }
}
