import java.util.Scanner;

public class bee1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        int soma = 0;

        while(true){
            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= 0 || n <= 0){
                break;
            }

            int inicio = Math.min(m, n);
            int fim = Math.max(n, m);
            for(int i=inicio; i <= fim; i++){
                System.out.print(i + " " );
                soma += i;
            }

            System.out.print("Sum=" + soma);
            soma = 0;
            System.out.print("\n");
        }
        sc.close();
    }
}
