import java.util.Scanner;
import java.util.Locale;

public class main29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] num = new double[n];
        int cont = 0;
        double x = 0;
        for(int i=0; i < n; i++){
            num [i] = sc.nextDouble();
            if (x < num[i]){
                x = num[i];
                cont++;
            }
        }
        System.out.println(x);
        System.out.println(cont);
        sc.close();
    }
}
