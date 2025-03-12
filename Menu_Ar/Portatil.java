package Menu_Ar;

public class Portatil extends Ar_Condicionado{
    private String voltagem;
    private String cor;
    
    public Portatil(String codigo, String marca, String btu, String defeito, String voltagem, String cor) {
        super(codigo, marca, btu, defeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
