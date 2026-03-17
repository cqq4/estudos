import java.util.Locale;
import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        while (true){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double raio;
        raio = sc.nextDouble();
        if (raio == 0){
            break;
        }
        System.out.printf("A= %.4f", raio*n*raio);
        sc.close();
        }
    }
}
