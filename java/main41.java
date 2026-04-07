import java.util.Scanner;

public class main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] A;
        A = new int[n][m];
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
    
        }
        System.out.println("VALORES NEGATIVOS:");
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j] < 0){
                    System.out.println(A[i][j]);
                }
            }
        }
        sc.close();
    }
}
