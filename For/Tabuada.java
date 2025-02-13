package For;

public class Tabuada {
    public static void main(String[] args) throws Exception, InterruptedException {
        for (int i=1; i<=10; i++){
            System.out.println("\n");
            for(int x=1; x<=10; x++){
                System.out.println("Tabuada de "+i+ ": "+i+" * "+x+" = "+(i*x));
            }
        }
        System.out.println("");

}
}
