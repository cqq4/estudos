import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;

public class main57 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preco atual do Dolar ? ");
        Dolar.COTACAO = sc.nextDouble();
        System.out.print("Quantos Dolares voce gostaria de converter? ");
        double valor = sc.nextDouble(); 
        System.out.printf("Seu saldo sera de = %.2f ", Dolar.CurrencyConverter(valor));
    }
}
