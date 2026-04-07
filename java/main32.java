import java.util.Locale;
import java.util.Scanner;

public class main32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] num  = new double[n];
        double media = 0;
        for(int i=0; i<n; i++){
            num[i] = sc.nextDouble();
            media += num[i]/n;
        }

        System.out.println(media);

        for(int i=0; i<n; i++){
            if(media > num[i]){
                System.out.println(num[i]);
            }
        }
        sc.close();
    }
}
