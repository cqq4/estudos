
import java.util.Locale;
import java.util.Scanner;

public class bee1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float n1;
        int cont = 0;
        float soma = 0;
        float media =0;
        while (cont <2){
            n1 = sc.nextFloat();
            if (n1<0 || n1>10){
                System.out.println("nota invalida");
            }else{
                soma+= n1;
                media = soma/2;
                cont++;
            }
        }
        System.out.printf("media = %.2f", media);
    }
}
     

