package Veiculos;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String nome, String marca, int ano, int cilindradas){
        super(nome,marca,ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibirInfo() {
        System.out.println("Nome: "+getNome()+" | Marca: "+getMarca()+" | Ano: "+getAno()+" | Cilindradas: "+getCilindradas());
    }
}
