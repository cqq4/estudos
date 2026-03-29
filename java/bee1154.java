import java.util.Locale;
import java.util.Scanner;

public class bee1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;
        int cont = 0 ;
        x = sc.nextInt();
        int soma = 0;
        while(x > 0){
            soma+=x;
            cont++;
            x = sc.nextInt();
            if (x<0){
                double media = (double) soma/cont;
                System.out.printf("%.2f\n", media);
            }
        }
        sc.close();
    }
}
