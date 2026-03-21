import java.util.Scanner;
public class main16 {
    public static void main(String[] args) {
        int n,ano,meses,dias,resto;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ano = n/365;
        resto = n%365;
        meses = resto/30;
        dias = resto%30;
        System.out.printf("%d ano(s)\n %d mes(es)\n  %d dia(s)", ano, meses, dias);


    }
}
