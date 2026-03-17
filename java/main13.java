import java.util.Locale;
import java.util.Scanner;
public class main13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int r;
        double pi =  3.14159;
        r = sc.nextInt();
        System.out.printf("VOLUME = %.3f", (4/3.0)*pi*r*r*r);
        sc.close();
    }
}