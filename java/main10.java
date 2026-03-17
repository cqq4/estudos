import java.util.Locale;
import java.util.Scanner;
public class main10{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float x1,y1,x2,y2;
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        System.out.printf("%.4f", Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2-y1, 2)));      
        sc.close(); 
}
}