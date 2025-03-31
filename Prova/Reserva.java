public class Reserva {
    private int numeroAviao;
    private String passageiro;
    
    public Reserva(int numeroAviao, String passageiro) {
        this.numeroAviao = numeroAviao;
        this.passageiro = passageiro;
    }

    public int getNumeroAviao() {
        return numeroAviao;
    }

    public void setNumeroAviao(int numeroAviao) {
        this.numeroAviao = numeroAviao;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    
}
