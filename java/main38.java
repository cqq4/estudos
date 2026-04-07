import java.util.Scanner;

public class main38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] [] A;
        A = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.printf(A[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
