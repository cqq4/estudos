import java.util.Locale;
import java.util.Scanner;
public class main19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double n1, n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        double r = (n1+n2)*2/2.0;
        if (r > 60.00){
            System.out.printf("NOTA FINAL  = %.1f", r);
        }else {
            System.out.printf("NOTA FINAL = %.1f\n", r);
            System.out.println("REPROVADO");
        }
        sc.close();
    }    
}
