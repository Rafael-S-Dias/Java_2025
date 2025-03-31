public class Aviao {
    private int numero;
    private int assentosDisponiveis;
    
    public Aviao(int numero, int assentosDisponiveis) {
        this.numero = numero;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public void reduzirAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
        }
    }
}