package Menu_Ar;

public class Splinter extends Ar_Condicionado{
    private String tipos;
    private String tamanho;

    public Splinter(String codigo, String marca, String btu, String defeito, String tipos, String tamanho) {
        super(codigo, marca, btu, defeito);
        this.tipos = tipos;
        this.tamanho = tamanho;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    
}
