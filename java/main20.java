import java.util.Locale;
import java.util.Scanner;
public class main20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a == 0 ){
            System.out.println("Impossivel calcular");
        }else{
            double delta = b*b - (4*a*c);
            if (delta < 0){    
                System.out.println("Impossivel Calular");
            }else {
                double x1 = (-b +  Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("R1 = %.5f\n", x1);
                System.out.printf("R2 = %.5f\n", x2);
            }
        }
        sc.close();
    }
}
