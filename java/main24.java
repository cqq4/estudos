import java.util.Scanner;
public class main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a <= b && a <= c){
            System.out.printf("MENOR = %d",a);
        }
        else if(b <= a && b <= c){
            System.out.printf("MENOR = %d",b);
        }
        else if (c <= a && c <= b){
            System.out.printf("MENOR = %d", c);
        }
    }
}
