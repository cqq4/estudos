import java.util.Locale;
import java.util.Scanner;
public class bee1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a + b > c && a+ c> b && b + c > a){
            double perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f", perimetro);
        }else {
            double area = (a+b) * c/2;
            System.out.printf("Area = %.1f", area);
        }
        sc.close();
    }
}
