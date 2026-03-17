import java.util.Scanner;
public class main11 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); 
        System.out.printf("%d eh o maior", Math.max(a, Math.max(b,c)));
    }
}
