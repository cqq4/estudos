import java.util.Locale;
import java.util.Scanner;

public class bee1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double soma =0 ;
        double [] a = new double[6];
        for(int i =0 ; i < 6; i++){
            a[i] = sc.nextDouble();
            if(a[i] > 0 ){
                cont++;
                soma += a[i];
                media = soma/cont;
            }
        }
        System.out.printf("%d valores positivos\n",cont);
        System.out.printf("%.1f",media);
    }
}
