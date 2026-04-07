import java.util.Scanner;
import java.util.Locale;

public class java33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double media = 0;
        double soma = 0;
        int cont = 0;
        double [] num = new double[n];
        for(int i = 0; i<n; i++){
            num[i] = sc.nextDouble();
            if(num[i]%2 == 0){
                cont++;
                soma += num[i];
                media = soma / cont;
            }
        }
        System.out.printf("%.2f", media);
        sc.close();
    }
}
