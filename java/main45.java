import java.util.Scanner;

public class main45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] A,B,C;
        A = new int[m][n];
        B = new int[m][n];
        C = new int[m][n];
        for (int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                A[i][j] = sc.nextInt();

            }
        }
        for (int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                C [i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
