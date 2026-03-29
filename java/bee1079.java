
import java.util.Locale;
import java.util.Scanner;

public class bee1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        double media = 0;
        for (int i=0; i < x; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            media = ((n1*2)+(n2*3)+(n3*5))/10.0;
            System.out.printf("%.1f\n",media);
            media = 0;
        }
        sc.close();
    }
}
