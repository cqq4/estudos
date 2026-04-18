import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class main66 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();
        double maior = 0;
        int posicao = 0;
        double [] A = new double[n];
        for(int i=0;i<A.length; i++){
            System.out.print("Digite um numero: ");
            A[i]=sc.nextDouble();
            if(A[i] > maior){
                maior = A[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f \n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        sc.close();

    }
}
