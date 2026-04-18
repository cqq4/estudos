import java.util.Scanner;

public class main67 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int [] vectA = new int[n];
        int [] vectB = new int[n];
        int [] vectC = new int[n];
        for(int i=0; i<vectA.length; i++){
            System.out.print("Digite os valores do vetor A: " );
            vectA[i] = sc.nextInt();
        }

        for (int j=0; j<vectA.length; j++) {
            System.out.print("Digite os valores do vetor B: ");
            vectB[j] = sc.nextInt();
        }

        for(int i=0; i<vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for(int i=0; i<vectC.length; i++) {
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
