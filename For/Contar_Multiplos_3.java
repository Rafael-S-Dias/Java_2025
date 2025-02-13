package For;

public class Contar_Multiplos_3 {
    public static void main(String[] args) throws Exception {
        int x = 0;

        for (int i =1; i<=100; i++){
            if(i % 3== 0){
                System.out.println("Números multiplos de três: "+i);
                x++;
            }
        }
        System.out.println("Quantidade de números multiplos de três: "+x);
}
}
