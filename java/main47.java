import java.util.Scanner;

public class main47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt(); 
        int [][] A;
        A = new int[m][n];
        int linha;
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int girar = sc.nextInt();
        linha = girar -1;
        int ultimo = A[linha][n-1];
        for(int j=n-1; j>0; j--){
            A[linha][j] = A[linha][j-1];
        }
        A[linha][0] = ultimo;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }
    }
}
