import java.util.Scanner;

public class main65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();
        int[] A = new int[n];
        int cont = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite um numero: ");
            A[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES:\n ");

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
                cont++;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADES PDE PARES = " + cont);
        sc.close();
    }
}
