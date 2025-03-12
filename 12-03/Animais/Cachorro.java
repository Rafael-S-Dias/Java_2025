package Animais;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void exibirSom(){
        System.out.println("Nome: "+getNome()+" | Patas: "+getPatas()+" | Raça: "+getRaca()+" | Som: Late");
    }
}
