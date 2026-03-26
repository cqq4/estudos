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
            if (r <= 3000.00){  // ser for menor ou igual a 3000
                imposto += (r - 2000.00) * 0.08; //diminui salario - 2000
            }else {
            imposto +=(3000.00 - 2000.00) * 0.08; //caso seja maior q 3k faz a taxa por 1k
            }
            if (r > 3000.00){
                if(r <= 4500.00){
                imposto += (r - 3000.00) * 0.18; 
                }else if(r > 4500.00){
                    imposto += (4500.00 - 3000.00) * 0.18;
                }
            }
            if (r > 4500.00){
                imposto +=(r - 4500.00) * 0.28;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
