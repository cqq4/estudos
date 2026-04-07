import java.util.Locale;
import java.util.Scanner;

public class main26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] a = new double[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
        }
        for (int i=0; i <n; i++){
            System.out.printf("%.1f\n",a[i]);
        }
    }
}
