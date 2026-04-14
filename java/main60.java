import java.util.Scanner;
import java.util.Locale;
public class main60 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int [] A;
        int m = sc.nextInt();
        double media = 0;
        A = new int [m];
        for(int i =0; i<m; i++){
            double altura = sc.nextDouble();
            media += altura / m;
        }
        System.out.printf("Media de altura, %.2f ", media);
    }
}
