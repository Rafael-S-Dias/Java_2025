package Arrays;

public class Array1 {
        public static void main(String[] args) {
        
            int [] numeros={10,20,30,40,50};
    
            System.out.println("Elementos do Array: ");
    
            for (int numero:numeros){
                System.out.println(numero);
            }
            System.out.println("");
            for (int i=0; i<numeros.length;i++){
                System.out.println("Elementos "+i+": "+numeros[i]);
            }
        }
    }
    

