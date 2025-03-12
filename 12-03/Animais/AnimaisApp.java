package Animais;

public class AnimaisApp {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Thor", 4, "Cockspaniel");
        Gato gato1 = new Gato("Garfield", 4, "Laranja");

        cachorro1.exibirSom();
        gato1.exibirSom();
}

}
