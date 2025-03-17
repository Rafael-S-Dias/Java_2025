package Menu_Animais;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int qtds_patas, String raca) {
        super(nome, qtds_patas);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    void emitirSom() {
            System.out.println("O cachorro "+ getNome()+" faz AU AU AU");
            
        }
}
