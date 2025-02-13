package For;

public class Pares_e_Impares {
    public static void main(String[] args) throws Exception, InterruptedException {
        
        for (int i =1; i<=51; i+=2){
            if(i%2!=0){
                System.out.println("Número Impares: "+i);
            }
        }

        for (int x =52; x<=100; x+=2){
            if(x%2 == 0){
                System.out.println("Número Pares: "+x);
            }
        }
}
}
