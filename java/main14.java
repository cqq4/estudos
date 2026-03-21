import java.util.Scanner;
public class main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, segundos, minutos, horas , resto;
        n = sc.nextInt();
        horas = n/3600;
        resto = n%3600;
        minutos = resto / 60;
        segundos =  resto % 60;
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
    
}