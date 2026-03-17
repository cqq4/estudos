import java.util.Locale;
import java.util.Scanner;
public class main9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;
        float y;
        x = sc.nextInt();
        y = sc.nextFloat();
        System.out.printf("%.3f km/l", x/y);
        sc.close();

    }
    
}
