import java.util.Scanner;

public class main39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] A;
        int cont = 0;
        A = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
                if(A[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        for(int i=0; i<n; i++){
            System.out.println(A[i][i] + " ");
        }
        
        System.out.printf("");
        System.out.printf("QUANTIDADE DE NEGATIVOS = %d",cont);
        sc.close();
    }
}
