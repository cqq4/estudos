import java.util.Scanner;
import java.util.Locale;

public class main34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] nome = new String[n];
        double [] nota1 = new double[n];
        double [] nota2 = new double[n];        
        for(int i =0; i <n; i++){
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            double media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6.0){
                System.out.printf("%s\n", nome[i]);
            }
        }
        sc.close();
    }
}