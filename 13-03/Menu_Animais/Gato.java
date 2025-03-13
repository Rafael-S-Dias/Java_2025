package Menu_Animais;

public class Gato extends Animal {
    private String cor;

    
    public Gato(String nome, int qtds_patas, String cor) {
        super(nome, qtds_patas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    void emitirSom() {
            System.out.println("O cachorro "+ getNome()+" faz MIAU MIAU");
            
        }

}
