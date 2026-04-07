import java.util.Locale;
import java.util.Scanner;

public class main46 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int linha;
        int coluna;
        double somapositivo = 0;
        double [][] A;
        A = new double[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextDouble();
            }
        }

        linha = sc.nextInt();
        coluna = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(A[i][j]>0){
                    somapositivo+= A[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f\n", somapositivo);

        System.out.print("LINHA ESCOLHIDA: ");
        for(int j=0; j<n; j++){
            System.out.printf("%.1f ", A[linha][j]);
        }

        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", A[i][coluna]);
        }

        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", A[i][i]);
        }

        System.out.println();

        System.out.println("MATRIZ ALTERADA:" );
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(A[i][j] < 0 ){
                    A[i][j] = A[i][j] * A[i][j];
                }
                System.out.printf("%.1f ", A[i][j]);
            }
            System.out.println();
        }
    }
}
