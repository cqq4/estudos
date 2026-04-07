import java.util.Locale;
import java.util.Scanner;

public class main40 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double [][]A;
        A = new double[n][m];
        for(int i=0; i<n; i++){
            double soma=0;
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextDouble();
                soma += A[i][j];
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
