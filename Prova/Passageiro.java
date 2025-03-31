public class Passageiro extends Aviao {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Passageiro(int numero, String nome) {
        super(numero);
        this.nome = nome;
    }

    

    
}
