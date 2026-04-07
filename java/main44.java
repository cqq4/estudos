import java.util.Scanner;

public class main44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] A;
        int soma = 0;
        A = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j > i)
                    soma += A[i][j];
            }
        }
        System.out.println(soma + " ");
    }
}
