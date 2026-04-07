import java.util.Scanner;

public class main42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]A;
        A = new int[n][n];
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for  (int i=0; i<n; i++){
            int soma = 0;
            for(int j=0; j<n; j++){
                soma += A[i][j];
            }
        System.out.println(soma);
        }
    }
}
