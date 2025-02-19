package Arrays;

public class Array2 {
    public static void main(String[] args) {
        
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana"};
        double[] notas = {8.5, 7.0, 9.2, 6.8};
    
        System.out.println("Alunos: ");
        for (int i = 0; i < alunos.length; i++){
            System.out.println((i+1)+"° Aluno: "+alunos[i]+" - Nota: "+notas[i]);
        }
    }
}
