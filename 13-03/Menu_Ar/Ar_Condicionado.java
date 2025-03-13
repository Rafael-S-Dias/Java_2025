package Menu_Ar;

public class Ar_Condicionado {
    private String codigo;
    private String marca;
    private String btu;
    private String defeito;

    public Ar_Condicionado(String codigo, String marca, String btu, String defeito) {
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getBtu() {
        return btu;
    }

    public void setBtu(String btu) {
        this.btu = btu;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    
    
}
