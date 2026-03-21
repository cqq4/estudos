import java.util.Locale;
import java.util.Scanner;
public class main17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int y = (int) n;
        int centavos = (int) Math.round((n - y)* 100);
        System.out.println("NOTAS:");
        int[] notas = {100,50,20,10,5,2};
        for (int i = 0; i < 6; i++){
            int qtd = (y) / notas[i];
            System.out.printf("%d nota(s) de R$ %d.00\n", qtd, notas[i]);
            y = y%notas[i];
        }
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$1.00\n", y);
        int[] moedas = {50,25, 10, 5, 1};
        for (int i= 0; i <5; i++){
            int qtd = centavos / moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, moedas[i]/100.0);
            centavos = centavos%moedas[i];
        }
        sc.close();
    }
}
