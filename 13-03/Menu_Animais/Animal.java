package Menu_Animais;

abstract class Animal {
    private String nome;
    private int qtds_patas;
    
    public Animal(String nome, int qtds_patas) {
        this.nome = nome;
        this.qtds_patas = qtds_patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtds_patas() {
        return qtds_patas;
    }

    public void setQtds_patas(int qtds_patas) {
        this.qtds_patas = qtds_patas;
    }
    
    abstract void emitirSom();
    
}
