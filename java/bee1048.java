import java.util.Locale;
import java.util.Scanner;
public class bee1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        if (sal <= 400.00){
            System.out.printf("Novo salario: %.2f\n", sal+sal * 0.15);
            System.out.printf("Reajuste ganho: %.2f\n", sal* 0.15);
            System.out.println("Em percentual: 15 %");
        }else if(sal <= 800.00){
            System.out.printf("Novo salario: %.2f\n", sal+sal * 0.12);
            System.out.printf("Reajuste ganho: %.2f\n", sal* 0.12);
            System.out.println("Em percentual: 12 %");
        }else if (sal <= 1200.00){
            System.out.printf("Novo salario: %.2f\n", sal+sal * 0.10);
            System.out.printf("Reajuste ganho: %.2f\n", sal* 0.10);
            System.out.println("Em percentual: 10 %");
        }else if (sal <=2000.00){
            System.out.printf("Novo salario: %.2f\n", sal+sal * 0.07);
            System.out.printf("Reajuste ganho: %.2f\n", sal* 0.07);
            System.out.println("Em percentual: 7 %");
        }else if (sal > 2000.00){
            System.out.printf("Novo salario: %.2f\n", sal+sal * 0.04);
            System.out.printf("Reajuste ganho: %.2f\n", sal* 0.04);
            System.out.println("Em percentual: 4 %");
        }
    }
}
