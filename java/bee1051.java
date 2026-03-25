import java.util.Locale;
import java.util.Scanner;
public class bee1051{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double r = sc.nextDouble();
        double imposto = 0;
        if(r <= 2000.00 ){
            System.out.println("Isento");
        }else{
            if (r > 2000.00){
                if (r> 3000.00){
                    imposto += (3000.00 - 2000.00) * 0.08;
                }else {
                imposto +=(r - 2000.00) * 0.08;
                }
            }
            if (r > 3000.00){
                imposto += (r - 4500.00 - 3000.00) * 0.08; 
            }else {
                imposto +=(r - 3000.00) * 0.18;
            }
            if (r >4500.00){
                imposto +=(r - 4500.00) * 0.28;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
